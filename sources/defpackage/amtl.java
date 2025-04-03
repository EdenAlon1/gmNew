package defpackage;

import android.net.Uri;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amtl implements amtm {
    private final ffsk a;
    private final awhc b;
    private final cknc c;
    private final avkf d;
    private final awnp e;

    public amtl(ffsk ffskVar, awhc awhcVar, cknc ckncVar, avkf avkfVar, awnp awnpVar) {
        ffskVar.getClass();
        awhcVar.getClass();
        ckncVar.getClass();
        avkfVar.getClass();
        this.a = ffskVar;
        this.b = awhcVar;
        this.c = ckncVar;
        this.d = avkfVar;
        this.e = awnpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x012f A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0028, B:12:0x011f, B:14:0x012f, B:15:0x0131, B:18:0x0137), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.amfx r9, defpackage.axad r10, java.lang.String r11, android.net.Uri r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amtl.e(amfx, axad, java.lang.String, android.net.Uri, ffgu):java.lang.Object");
    }

    private static final awui f(amfx amfxVar) {
        aqux f = amfxVar.f();
        if (f == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Optional m = f.m();
        final ffji ffjiVar = new ffji() { // from class: amte
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return ((aoku) obj).e();
            }
        };
        Object orElseThrow = m.flatMap(new Function() { // from class: amtf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseThrow(new Supplier() { // from class: amtg
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalArgumentException("Active self identity required");
            }
        });
        orElseThrow.getClass();
        return (awui) orElseThrow;
    }

    @Override // defpackage.amtm
    public final elfl a(amfx amfxVar, Uri uri) {
        elfl c;
        amfxVar.getClass();
        cknc ckncVar = this.c;
        axad a = ckncVar.a();
        cknc.r(ckncVar, 24, 0, null, a, null, null, 54);
        c = axol.c(this.a, ffhe.a, ffsm.a, new amth(this, amfxVar, a, uri, null));
        return c;
    }

    @Override // defpackage.amtm
    public final elfl b(amfx amfxVar, String str) {
        elfl c;
        amfxVar.getClass();
        str.getClass();
        cknc ckncVar = this.c;
        axad a = ckncVar.a();
        cknc.r(ckncVar, 22, 0, null, a, null, null, 54);
        c = axol.c(this.a, ffhe.a, ffsm.a, new amtj(this, amfxVar, a, str, null));
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r4v3, types: [amtl] */
    /* JADX WARN: Type inference failed for: r5v1, types: [amfx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.amfx r20, defpackage.axad r21, android.net.Uri r22, defpackage.ffgu r23) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amtl.c(amfx, axad, android.net.Uri, ffgu):java.lang.Object");
    }
}
