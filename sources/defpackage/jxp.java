package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxp extends ffkk implements ffjn {
    final /* synthetic */ Spannable a;
    final /* synthetic */ ffjo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxp(Spannable spannable, ffjo ffjoVar) {
        super(3);
        this.a = spannable;
        this.b = ffjoVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        jou jouVar = (jou) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        jsf jsfVar = jouVar.f;
        jsy jsyVar = jouVar.c;
        if (jsyVar == null) {
            jsyVar = jsy.e;
        }
        jss jssVar = jouVar.d;
        jss jssVar2 = new jss(jssVar != null ? jssVar.a : 0);
        jst jstVar = jouVar.e;
        this.a.setSpan(new jri((Typeface) this.b.a(jsfVar, jsyVar, jssVar2, new jst(jstVar != null ? jstVar.a : 65535))), intValue, intValue2, 33);
        return ffcu.a;
    }
}
