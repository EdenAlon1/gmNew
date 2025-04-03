package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acm extends ffkk implements ffji {
    final /* synthetic */ acj a;
    final /* synthetic */ adn b;
    final /* synthetic */ String c;
    final /* synthetic */ adu d;
    final /* synthetic */ hkx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acm(acj acjVar, adn adnVar, String str, adu aduVar, hkx hkxVar) {
        super(1);
        this.a = acjVar;
        this.b = adnVar;
        this.c = str;
        this.d = aduVar;
        this.e = hkxVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        final hkx hkxVar = this.e;
        adg b = this.b.b(this.c, this.d, new adf() { // from class: ack
            @Override // defpackage.adf
            public final void a(Object obj2) {
                ((ffji) hkx.this.a()).invoke(obj2);
            }
        });
        acj acjVar = this.a;
        acjVar.a = b;
        return new acl(acjVar);
    }
}
