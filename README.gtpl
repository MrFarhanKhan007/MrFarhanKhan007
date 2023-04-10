### Farhan Khan

Hi there, I'm a college student and aspiring Android developer! 👋
Welcome to my Github profile! I am currently in my 2nd year of college studying in Amity University,
  and I am passionate about learning and exploring new technologies. My current focus is on Kotlin Android development 💻, and I am constantly working to improve my skills in this area.

[`📫 mrfarhankhan007@gmail.com`](mailto:fk95034@gmail.com)
[`🐦 @mrfarhankhan007`](https://twitter.com/Toxiclucien)

### 👷 Check out what I'm currently working on
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### 🌱 My latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}

### 🔨 My recent Pull Requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}

### 🔭 Latest releases I've contributed to
{{ range recentReleases 5 }}
- [{{ .Name }}]({{ .URL }}) [`{{ .LastRelease.TagName }}`]({{ .LastRelease.URL }}) - {{.Description}}
{{- end }}

### ⭐ Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### 💖 Recent followers
{{ range followers 5 }}
- [**@{{ .Login }}**]({{ .URL }})
{{- end }}


