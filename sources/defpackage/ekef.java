package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekef {
    public static final ekeg a(ejzx ejzxVar, ecwp ecwpVar, edbo edboVar) {
        if (edboVar.d) {
            String str = ejzxVar.d;
            str.getClass();
            if (str.length() != 0) {
                String str2 = ejzxVar.d;
                ecwpVar.copyOnWrite();
                ecwu ecwuVar = (ecwu) ecwpVar.instance;
                ecwu ecwuVar2 = ecwu.a;
                str2.getClass();
                ecwuVar.b |= 1;
                ecwuVar.c = str2;
            }
        } else {
            String str3 = ejzxVar.d;
            ecwpVar.copyOnWrite();
            ecwu ecwuVar3 = (ecwu) ecwpVar.instance;
            ecwu ecwuVar4 = ecwu.a;
            str3.getClass();
            ecwuVar3.b |= 1;
            ecwuVar3.c = str3;
        }
        String str4 = ejzxVar.c;
        str4.getClass();
        eyee eyeeVar = (ejzxVar.b & 4) != 0 ? ejzxVar.e : null;
        long j = ejzxVar.i;
        eyfy build = ecwpVar.build();
        build.getClass();
        return new ekeg(str4, eyeeVar, j, (ecwu) build);
    }
}
