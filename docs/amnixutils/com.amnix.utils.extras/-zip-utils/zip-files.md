[amnixutils](../../index.md) / [com.amnix.utils.extras](../index.md) / [ZipUtils](index.md) / [zipFiles](./zip-files.md)

# zipFiles

`static fun zipFiles(srcFiles: `[`MutableCollection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, zipFilePath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) [(source)](https://github.com/AmniX/amnixUtils/tree/master/amnixutils/src/main/java/com/amnix/utils/extras/ZipUtils.java#L30)

Zip the files.

### Parameters

`srcFiles` - The source of files.

`zipFilePath` - The path of ZIP file.

### Exceptions

`IOException` - if an I/O error has occurred

**Return**
`true`: success`false`: fail

`static fun zipFiles(srcFilePaths: `[`MutableCollection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, zipFilePath: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, comment: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) [(source)](https://github.com/AmniX/amnixUtils/tree/master/amnixutils/src/main/java/com/amnix/utils/extras/ZipUtils.java#L45)

Zip the files.

### Parameters

`srcFilePaths` - The paths of source files.

`zipFilePath` - The path of ZIP file.

`comment` - The comment.

### Exceptions

`IOException` - if an I/O error has occurred

**Return**
`true`: success`false`: fail

`static fun zipFiles(srcFiles: `[`MutableCollection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection/index.html)`<`[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`>, zipFile: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) [(source)](https://github.com/AmniX/amnixUtils/tree/master/amnixutils/src/main/java/com/amnix/utils/extras/ZipUtils.java#L73)

Zip the files.

### Parameters

`srcFiles` - The source of files.

`zipFile` - The ZIP file.

### Exceptions

`IOException` - if an I/O error has occurred

**Return**
`true`: success`false`: fail

`static fun zipFiles(srcFiles: `[`MutableCollection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection/index.html)`<`[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`>, zipFile: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, comment: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) [(source)](https://github.com/AmniX/amnixUtils/tree/master/amnixutils/src/main/java/com/amnix/utils/extras/ZipUtils.java#L87)

Zip the files.

### Parameters

`srcFiles` - The source of files.

`zipFile` - The ZIP file.

`comment` - The comment.

### Exceptions

`IOException` - if an I/O error has occurred

**Return**
`true`: success`false`: fail

