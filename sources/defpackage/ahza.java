package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahza extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ int b;
    final /* synthetic */ ahzb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahza(ahzb ahzbVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = ahzbVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        ahza ahzaVar = new ahza(this.c, (ffgu) obj3);
        ahzaVar.a = (String) obj;
        ahzaVar.b = intValue;
        return ahzaVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ahzb ahzbVar = this.c;
        Context context = ahzbVar.a;
        ?? r3 = this.a;
        int i = this.b;
        String string = context.getString(R.string.multi_share_bottom_compose_row_text_placeholder);
        string.getClass();
        Integer num = new Integer(i);
        ahzb ahzbVar2 = this.c;
        return new dmmp(ahzbVar.i, (CharSequence) r3, string, num, true, new dmmo(ahzbVar2.e.a(), ahzbVar2.f.a(), ahzbVar2.g.a()), 32);
    }
}
