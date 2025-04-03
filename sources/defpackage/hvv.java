package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hvv extends ffkk implements ffjo {
    final /* synthetic */ hvx a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvv(hvx hvxVar, int i) {
        super(4);
        this.a = hvxVar;
        this.b = i;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        Rect rect = new Rect(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
        hvx hvxVar = this.a;
        hvxVar.j.a.notifyViewEntered(hvxVar.b, this.b, rect);
        return ffcu.a;
    }
}
