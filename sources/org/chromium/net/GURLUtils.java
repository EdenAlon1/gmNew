package org.chromium.net;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class GURLUtils {

    /* compiled from: PG */
    public interface Natives {
        String getOrigin(String str);
    }

    public static String getOrigin(String str) {
        return GURLUtilsJni.get().getOrigin(str);
    }
}
