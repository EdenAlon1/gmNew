package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xlc extends ffhv implements ffjr {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ boolean d;
    /* synthetic */ boolean e;
    /* synthetic */ boolean f;
    final /* synthetic */ xle g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlc(xle xleVar, ffgu ffguVar) {
        super(7, ffguVar);
        this.g = xleVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        String string;
        String string2;
        String string3;
        ffci.b(obj);
        xis xisVar = (xis) this.a;
        int i = xisVar.h;
        boolean z = xisVar.a;
        int i2 = xisVar.b;
        alyx alyxVar = xisVar.c;
        long j = xisVar.d;
        boolean z2 = xisVar.e;
        boolean z3 = xisVar.f;
        boolean z4 = xisVar.g;
        Object obj2 = this.b;
        Object obj3 = this.c;
        boolean z5 = obj3 instanceof xlo;
        boolean z6 = this.d;
        boolean z7 = this.e;
        boolean z8 = this.f;
        int i3 = R.string.compose_bar_text_hint_enter_xms;
        if (z5) {
            boolean b = alxf.b(i);
            xlu a = ((xlo) obj3).a();
            boolean z9 = obj3 instanceof xlm;
            if (!z9) {
                Object b2 = this.g.h.b();
                b2.getClass();
                if (((CharSequence) b2).length() > 0) {
                    xle xleVar = this.g;
                    Object b3 = xleVar.h.b();
                    String string4 = xleVar.b.getString(R.string.compose_bar_text_inspiring_hint_xms);
                    Objects.toString(b3);
                    string3 = String.valueOf(b3).concat(String.valueOf(string4));
                    return new xjc(a, b, z, i2, alyxVar, z9, string3);
                }
            }
            xle xleVar2 = this.g;
            if (true == z9) {
                i3 = R.string.compose_bar_text_hint_enter_mass_sms;
            }
            string3 = xleVar2.b.getString(i3);
            string3.getClass();
            return new xjc(a, b, z, i2, alyxVar, z9, string3);
        }
        if (obj3 instanceof xll) {
            xlu xluVar = ((xll) obj3).a;
            boolean b4 = alxf.b(i);
            String string5 = this.g.b.getString(R.string.compose_bar_text_hint_enter_satellite_with_char_limit, new Long(j));
            string5.getClass();
            return new xja(xluVar, b4, z, i2, alyxVar, string5);
        }
        if (ffkj.e(obj3, xlj.a)) {
            boolean b5 = alxf.b(i);
            if (!z6) {
                Object b6 = this.g.h.b();
                b6.getClass();
                if (((CharSequence) b6).length() > 0) {
                    xle xleVar3 = this.g;
                    Object b7 = xleVar3.h.b();
                    String string6 = xleVar3.b.getString(R.string.compose_bar_text_inspiring_hint_xms);
                    Objects.toString(b7);
                    string2 = String.valueOf(b7).concat(String.valueOf(string6));
                    return new xiw(b5, z, i2, alyxVar, z6, string2);
                }
            }
            xle xleVar4 = this.g;
            if (z6) {
                i3 = R.string.compose_bar_text_hint_add_text;
            }
            string2 = xleVar4.b.getString(i3);
            string2.getClass();
            return new xiw(b5, z, i2, alyxVar, z6, string2);
        }
        if (!ffkj.e(obj3, xlk.a)) {
            throw new ffcd();
        }
        boolean b8 = alxf.b(i);
        if (z8) {
            string = this.g.b.getString(R.string.compose_bar_text_hint_enter_xms);
        } else {
            Object b9 = this.g.h.b();
            b9.getClass();
            if (((CharSequence) b9).length() > 0) {
                xle xleVar5 = this.g;
                Context context = xleVar5.b;
                Object b10 = xleVar5.h.b();
                String string7 = context.getString(R.string.compose_bar_text_inspiring_hint_rcs);
                Objects.toString(b10);
                string = String.valueOf(b10).concat(String.valueOf(string7));
            } else {
                string = this.g.b.getString(z6 ? R.string.compose_bar_text_hint_add_text : R.string.compose_bar_text_hint_enter_rcs);
            }
        }
        string.getClass();
        return new xiy(b8, z, i2, alyxVar, z6, (alxi) obj2, z7, string, z2, z3, z4);
    }

    @Override // defpackage.ffjr
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        boolean booleanValue2 = ((Boolean) obj5).booleanValue();
        boolean booleanValue3 = ((Boolean) obj6).booleanValue();
        xlc xlcVar = new xlc(this.g, (ffgu) obj7);
        xlcVar.a = (xis) obj;
        xlcVar.b = (alxi) obj2;
        xlcVar.c = (xlp) obj3;
        xlcVar.d = booleanValue;
        xlcVar.e = booleanValue2;
        xlcVar.f = booleanValue3;
        return xlcVar.b(ffcu.a);
    }
}
