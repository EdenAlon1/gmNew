package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awyb {
    public static final /* synthetic */ awya a(awxv awxvVar) {
        eyfy build = awxvVar.build();
        build.getClass();
        return (awya) build;
    }

    public static final void b(awxx awxxVar, awxv awxvVar) {
        awxxVar.getClass();
        awxvVar.copyOnWrite();
        awya awyaVar = (awya) awxvVar.instance;
        awya awyaVar2 = awya.a;
        awyaVar.d = awxxVar.e;
        awyaVar.b |= 2;
    }

    public static final void c(awxz awxzVar, awxv awxvVar) {
        awxzVar.getClass();
        awxvVar.copyOnWrite();
        awya awyaVar = (awya) awxvVar.instance;
        awya awyaVar2 = awya.a;
        awyaVar.c = awxzVar.d;
        awyaVar.b |= 1;
    }

    public static final void d(awxv awxvVar) {
        awxvVar.copyOnWrite();
        awya awyaVar = (awya) awxvVar.instance;
        awya awyaVar2 = awya.a;
        awyaVar.b |= 4;
        awyaVar.e = false;
    }
}
