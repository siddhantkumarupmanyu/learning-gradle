/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package java_applications_multi_project.utilities;

import java_applications_multi_project.list.LinkedList;

public class StringUtils {
    public static String join(LinkedList source) {
        return JoinUtils.join(source);
    }

    public static LinkedList split(String source) {
        return SplitUtils.split(source);
    }
}
