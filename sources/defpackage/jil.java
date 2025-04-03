package defpackage;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jil extends ffhv implements ffjm {
    int a;
    final /* synthetic */ jip b;
    final /* synthetic */ ScrollCaptureSession c;
    final /* synthetic */ Rect d;
    final /* synthetic */ Consumer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jil(jip jipVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = jipVar;
        this.c = scrollCaptureSession;
        this.d = rect;
        this.e = consumer;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jil) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            jip jipVar = this.b;
            ScrollCaptureSession scrollCaptureSession = this.c;
            Rect rect = this.d;
            kac kacVar = new kac(rect.left, rect.top, rect.right, rect.bottom);
            this.a = 1;
            obj = jipVar.a(scrollCaptureSession, kacVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        this.e.accept(icz.b((kac) obj));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new jil(this.b, this.c, this.d, this.e, ffguVar);
    }
}
