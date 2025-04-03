package defpackage;

import android.content.ContentValues;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjlr extends ffhv implements ffjm {
    final /* synthetic */ cjlk a;
    final /* synthetic */ cjkh b;
    final /* synthetic */ byte[] c;
    final /* synthetic */ String d;
    final /* synthetic */ cjls e;
    final /* synthetic */ cjli f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjlr(cjlk cjlkVar, cjkh cjkhVar, byte[] bArr, String str, cjls cjlsVar, cjli cjliVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cjlkVar;
        this.b = cjkhVar;
        this.c = bArr;
        this.d = str;
        this.e = cjlsVar;
        this.f = cjliVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjlr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean b = ekxi.b(u());
        cjlk cjlkVar = this.a;
        cjkh cjkhVar = this.b;
        byte[] bArr = this.c;
        String str = this.d;
        cjls cjlsVar = this.e;
        cjli cjliVar = this.f;
        if (!b) {
            throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        ekzz f = eleg.f("PipelineWorkDatabaseOperations#insertWOrkItem");
        try {
            String[] strArr = bwlg.a;
            bwjs bwjsVar = new bwjs();
            bwjsVar.h(cjlkVar);
            bwjsVar.f(cjkhVar);
            bwjsVar.e(bArr);
            bwjsVar.g(str);
            bwjsVar.b(null);
            bwjsVar.d(((cqoh) cjlsVar.b.b()).f());
            bwjsVar.c(cjliVar);
            bwjn a = bwjsVar.a(new Supplier() { // from class: bwjp
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new bwjo();
                }
            });
            final dtve a2 = bwlg.a();
            dtub.b(bwlg.a(), "pipeline_work", a, new Function() { // from class: bwjk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return Long.valueOf(dtve.this.S("pipeline_work", (ContentValues) obj2));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: bwjl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            a.getClass();
            cjlt a3 = cjlm.a(a);
            ffig.a(f, null);
            return a3;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjlr(this.a, this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
