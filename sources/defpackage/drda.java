package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drda extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drdd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drda(drdd drddVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = drddVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drda) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            drdd drddVar = this.b;
            if (!drddVar.b()) {
                return ffcu.a;
            }
            ffwm ffwmVar = drddVar.d;
            if (ffwmVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ffwmVar.e(null);
            ffss ffssVar = this.b.c;
            if (ffssVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.a = 1;
            obj = ffssVar.c(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        int intValue = ((Number) obj).intValue();
        qri a = this.b.a();
        if (a.d) {
            a.d = false;
            try {
                a.e.write(59);
                a.e.flush();
            } catch (IOException unused) {
            }
            a.a = 0;
            a.e = null;
            a.f = null;
            a.g = null;
            a.h = null;
            a.i = null;
            a.j = true;
        }
        drdd drddVar2 = this.b;
        drddVar2.d = null;
        drddVar2.c = null;
        ((enrr) drdd.a.h().h("com/google/android/libraries/compose/gif/encoder/GifEncoder$finish$2", "invokeSuspend", 81, "GifEncoder.kt")).r("Finished encoding GIF with %d frames.", intValue);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drda(this.b, ffguVar);
    }
}
