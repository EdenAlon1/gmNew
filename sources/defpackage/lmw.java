package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lmw {
    public static final lnw a = new lmv();
    public final loc b;

    public lmw(lmx lmxVar, lms lmsVar) {
        this(lmxVar, lmsVar, (byte[]) null);
    }

    public final lml a(Class cls) {
        return b(ffiu.c(cls));
    }

    public final lml b(ffmo ffmoVar) {
        String a2 = lom.a(ffmoVar);
        if (a2 != null) {
            return this.b.a(ffmoVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(a2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public lmw(lmx lmxVar, lms lmsVar, lnx lnxVar) {
        lmsVar.getClass();
        lnxVar.getClass();
        this.b = new loc(lmxVar, lmsVar, lnxVar);
    }

    public /* synthetic */ lmw(lmx lmxVar, lms lmsVar, byte[] bArr) {
        this(lmxVar, lmsVar, lnv.a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lmw(lmy lmyVar) {
        this(lmyVar.S(), lol.b(lmyVar), lol.a(lmyVar));
        lmyVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lmw(lmy lmyVar, lms lmsVar) {
        this(lmyVar.S(), lmsVar, lol.a(lmyVar));
        lmyVar.getClass();
        lmsVar.getClass();
    }
}
