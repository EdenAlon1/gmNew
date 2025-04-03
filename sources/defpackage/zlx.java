package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zlx extends ffhv implements ffjn {
    /* synthetic */ boolean a;
    /* synthetic */ int b;
    final /* synthetic */ zmw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlx(zmw zmwVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = zmwVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        zlx zlxVar = new zlx(this.c, (ffgu) obj3);
        zlxVar.a = booleanValue;
        zlxVar.b = intValue;
        return zlxVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = this.a;
        int i = this.b;
        zmw zmwVar = this.c;
        return dohr.a(zmwVar.N, z, qmn.b(this.c.n, R.string.conversation_scroll_to_bottom_button_content_description, "count", new Integer(i)), zmw.a(i, zmwVar.n), null, 24);
    }
}
