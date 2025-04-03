package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evhz implements ffbr {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ ffbr c;
    private evht d = null;

    public evhz(Context context, String str, ffbr ffbrVar) {
        this.a = context;
        this.b = str;
        this.c = ffbrVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [evho, java.lang.Object] */
    @Override // defpackage.ffbr, defpackage.ffbq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final evht b() {
        if (this.d == null) {
            Context context = this.a;
            String str = this.b;
            ffbr ffbrVar = this.c;
            String packageName = context.getPackageName();
            ffbrVar.b().f();
            this.d = new evht(packageName, str);
        }
        return this.d;
    }
}
