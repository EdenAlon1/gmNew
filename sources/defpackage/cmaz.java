package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class cmaz implements ejlr<eyjv<cmay>, Void> {
    final /* synthetic */ cskc a;

    public cmaz(cskc cskcVar) {
        this.a = cskcVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        this.a.m("Successfully stored PhoneNumberRecord");
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        this.a.r(String.format("Error while trying to store PhoneNumberRecord, Failure: %s", th.getMessage()));
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
