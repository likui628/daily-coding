### 初始化项目
1. 初始化仓库 `pnpm init`
1. 指定项目运行的Node、pnpm版本
	```js
	{
	    "engines": {
	        "node": ">=16",
	        "pnpm": ">=7"
	    }
	}
	```
1. pnpm-workspace.yaml 配置
	```yaml
	packages:
	  # all packages in direct subdirs of packages/
	  - 'packages/*'
	  # all packages in subdirs of components/
	  - 'components/**'
	  # exclude packages that are inside test directories
	  - '!**/test/**'
	```

### 安装依赖
1. 安装全局依赖包 [--ignore-workspace-root-check](https://pnpm.io/cli/add#--ignore-workspace-root-check)
	```bash
	pnpm add <pkg> -w
	```
1. 安装子包依赖
	```bash
	pnpm --filter <package_selector> add <pkg>
	```
1. 从workspace查找安装依赖
	```bash
	pnpm add --filter  <package_selector> <pkg> --workspace
	```

### 执行scripts命令
1. 执行子包命令
	```bash
	pnpm run --filter <package_selector> <command>
	```
1. 执行所有子包命令, 如果子目录没有这个命令就跳过
	```bash
	pnpm run -r  <command>
	```
