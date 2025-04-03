package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mut implements mty {
    public static final /* synthetic */ int d = 0;
    public lqc a;
    public mxw b;
    private final lwm e;
    private int f;
    private mus g;
    private mox h;

    public mut(lwm lwmVar, nct nctVar) {
        mus musVar = new mus(nctVar);
        mox moxVar = new mox();
        mxw mxwVar = new mxw();
        this.e = lwmVar;
        this.g = musVar;
        this.h = moxVar;
        this.b = mxwVar;
        this.f = 1048576;
    }

    @Override // defpackage.mtk
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final muu b(lqw lqwVar) {
        mpm mpmVar;
        lti.f(lqwVar.b);
        mus musVar = this.g;
        mox moxVar = this.h;
        lti.f(lqwVar.b);
        lqq lqqVar = lqwVar.b.c;
        if (lqqVar == null) {
            mpmVar = mpm.m;
        } else {
            synchronized (moxVar.a) {
                lqq lqqVar2 = moxVar.b;
                int i = lvf.a;
                if (!Objects.equals(lqqVar, lqqVar2)) {
                    moxVar.b = lqqVar;
                    lwz lwzVar = new lwz();
                    lwzVar.a = null;
                    mpw mpwVar = new mpw(lwzVar);
                    enqu listIterator = lqqVar.c.entrySet().listIterator();
                    while (listIterator.hasNext()) {
                        Map.Entry entry = (Map.Entry) listIterator.next();
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        lti.f(str);
                        lti.f(str2);
                        synchronized (mpwVar.b) {
                            mpwVar.b.put(str, str2);
                        }
                    }
                    HashMap hashMap = new HashMap();
                    UUID uuid = lpn.a;
                    UUID uuid2 = lqqVar.a;
                    int[] l = ermn.l(lqqVar.g);
                    for (int i2 : l) {
                        boolean z = true;
                        if (i2 != 2 && i2 != 1) {
                            z = false;
                        }
                        lti.a(z);
                    }
                    mow mowVar = new mow(uuid2, mpwVar, hashMap, (int[]) l.clone());
                    byte[] bArr = lqqVar.h;
                    byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                    lti.c(mowVar.c.isEmpty());
                    mowVar.k = copyOf;
                    moxVar.c = mowVar;
                }
                mpmVar = moxVar.c;
                lti.f(mpmVar);
            }
        }
        return new muu(lqwVar, this.e, musVar, mpmVar, this.f, this.a);
    }

    public mut(lwm lwmVar) {
        this(lwmVar, new ncj());
    }

    @Override // defpackage.mtk
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.mtk
    public final /* synthetic */ void c(boolean z) {
    }

    @Override // defpackage.mtk
    public final /* synthetic */ void e(nkh nkhVar) {
    }
}
