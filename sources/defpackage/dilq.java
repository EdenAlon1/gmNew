package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dilq {
    public static final emye a = emye.b(';');

    public static String a(String str) {
        String[] split = str.split("=");
        if (split == null || split.length < 2) {
            throw new IllegalStateException(String.format("%s does not follow reason format.", str));
        }
        return split[1].trim();
    }
}
