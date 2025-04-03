package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clv {
    private clv() {
    }

    public static int a() {
        ClassLoader classLoader = clv.class.getClassLoader();
        classLoader.getClass();
        InputStream resourceAsStream = classLoader.getResourceAsStream("car-app-api.level");
        if (resourceAsStream == null) {
            throw new IllegalStateException(String.format("Car API level file %s not found", "car-app-api.level"));
        }
        try {
            String readLine = new BufferedReader(new InputStreamReader(resourceAsStream)).readLine();
            int parseInt = Integer.parseInt(readLine);
            if (parseInt <= 0 || parseInt > 8) {
                throw new IllegalStateException(a.t(readLine, "Unrecognized Car API level: "));
            }
            return parseInt;
        } catch (IOException unused) {
            throw new IllegalStateException("Unable to read Car API level file");
        }
    }
}
