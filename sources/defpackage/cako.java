package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cako extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ cakw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cako(cakw cakwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.f = cakwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cako) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ekzz f;
        cakk cakkVar;
        eozn b;
        Object obj2;
        ?? r0;
        ekzz ekzzVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                r0 = this.a;
                try {
                    ffci.b(obj);
                    ekzzVar = r0;
                    ffig.a(ekzzVar, null);
                    return ffcu.a;
                } catch (Throwable th) {
                    th = th;
                }
            } else {
                ?? r1 = this.d;
                obj2 = this.c;
                ?? r4 = this.b;
                ?? r5 = this.a;
                try {
                    ffci.b(obj);
                    b = r4;
                    cakkVar = r1;
                    f = r5;
                } catch (Throwable th2) {
                    th = th2;
                    r0 = r5;
                }
            }
            try {
                throw th;
            } catch (Throwable th3) {
                ffig.a(r0, th);
                throw th3;
            }
        }
        ffci.b(obj);
        cakw cakwVar = this.f;
        if (!ekxi.b(u())) {
            throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        f = eleg.f("E2eeInfoDataSource#fetchAndStoreData");
        try {
            cakkVar = (cakk) cakwVar.f.b();
            awui awuiVar = cakwVar.g.f;
            if (awuiVar == null) {
                awuiVar = awui.a;
            }
            awuiVar.getClass();
            b = eozn.b(cakwVar.g.e);
            if (b == null) {
                b = eozn.UNKNOWN;
            }
            b.getClass();
            this.a = f;
            this.b = b;
            this.c = awuiVar;
            this.d = cakkVar;
            this.e = 1;
            obj = cakwVar.e(this);
            if (obj != ffhhVar) {
                obj2 = awuiVar;
            }
            return ffhhVar;
        } catch (Throwable th4) {
            th = th4;
            r0 = f;
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(ffdx.n(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = ((awui) it.next()).d;
            str.getClass();
            arrayList.add(str);
        }
        this.a = f;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = 2;
        if (cakkVar.a((awui) obj2, b, arrayList, this) != ffhhVar) {
            ekzzVar = f;
            ffig.a(ekzzVar, null);
            return ffcu.a;
        }
        return ffhhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cako(this.f, ffguVar);
    }
}
