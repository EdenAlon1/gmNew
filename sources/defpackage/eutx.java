package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eutx implements euuf {
    final FirebaseInstanceId a;

    public eutx(FirebaseInstanceId firebaseInstanceId) {
        this.a = firebaseInstanceId;
    }

    @Override // defpackage.euuf
    public final dhre a() {
        String h = this.a.h();
        if (h != null) {
            return dhrt.c(h);
        }
        FirebaseInstanceId firebaseInstanceId = this.a;
        FirebaseInstanceId.k(firebaseInstanceId.d);
        return firebaseInstanceId.a(eutt.e(firebaseInstanceId.d), "*").b(new dhqh() { // from class: eutw
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                return ((euts) dhreVar.i()).a;
            }
        });
    }

    @Override // defpackage.euuf
    public final void b(euwm euwmVar) {
        this.a.h.add(euwmVar);
    }

    @Override // defpackage.euuf
    public final void c() {
        this.a.h();
    }
}
