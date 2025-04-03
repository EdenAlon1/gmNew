package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class clzg implements ejlr<eyjv<clzf>, Void> {
    final /* synthetic */ cskc a;

    public clzg(cskc cskcVar) {
        this.a = cskcVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        eyjv eyjvVar = (eyjv) obj;
        clze b = clze.b(((clzf) eyjvVar.a(clzf.a, eyfc.a())).h);
        if (b == null) {
            b = clze.UNRECOGNIZED;
        }
        Integer valueOf = Integer.valueOf(b.a());
        int b2 = clzd.b(((clzf) eyjvVar.a(clzf.a, eyfc.a())).c);
        if (b2 == 0) {
            b2 = 1;
        }
        Integer valueOf2 = Integer.valueOf(clzd.a(b2));
        int b3 = clzb.b(((clzf) eyjvVar.a(clzf.a, eyfc.a())).d);
        if (b3 == 0) {
            b3 = 1;
        }
        this.a.m(String.format("Successfully stored PhoneNumberInputUIEvent, UiVariant: %s, Source: %s, EventType: %s", valueOf, valueOf2, Integer.valueOf(clzb.a(b3))));
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        eyjv eyjvVar = (eyjv) obj;
        int b = clzd.b(((clzf) eyjvVar.a(clzf.a, eyfc.a())).c);
        if (b == 0) {
            b = 1;
        }
        Integer valueOf = Integer.valueOf(clzd.a(b));
        int b2 = clzb.b(((clzf) eyjvVar.a(clzf.a, eyfc.a())).d);
        if (b2 == 0) {
            b2 = 1;
        }
        this.a.r(String.format("Error while trying to store PhoneNumberInputUIEvent, Source: %s, EventType: %s, Failure: %s", valueOf, Integer.valueOf(clzb.a(b2)), th.getMessage()));
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
