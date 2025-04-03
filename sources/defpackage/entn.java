package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class entn {
    public static /* synthetic */ boolean a(int i, ense enseVar, StringBuilder sb) {
        if (i - 1 != 0 || enseVar == ense.a) {
            return false;
        }
        sb.append(enseVar.b());
        sb.append('.');
        sb.append(enseVar.d());
        sb.append(':');
        sb.append(enseVar.a());
        return true;
    }
}
