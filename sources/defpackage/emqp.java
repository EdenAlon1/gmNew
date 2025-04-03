package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emqp {
    public static final String a(String str, Object... objArr) {
        int i = 0;
        while (i < objArr.length - 1) {
            Object[] objArr2 = {objArr[i]};
            i++;
            str = str.replace(String.format("{%s}", objArr2), (CharSequence) objArr[i]);
        }
        return str;
    }
}
