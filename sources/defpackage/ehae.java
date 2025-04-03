package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import java.util.Locale;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehae {
    public final ehad a;
    public final ehad b;
    final float c;
    final float d;
    final float e;
    final float f;
    final float g;
    final float h;
    final int i;
    final int j;
    final int k;
    public int l;

    public ehae(Context context, ehad ehadVar) {
        AttributeSet attributeSet;
        int i;
        Locale.Category category;
        ehad ehadVar2 = new ehad();
        this.b = ehadVar2;
        int i2 = ehadVar.a;
        if (i2 != 0) {
            attributeSet = ehfy.d(context, i2, "badge");
            i = attributeSet.getStyleAttribute();
        } else {
            attributeSet = null;
            i = 0;
        }
        TypedArray a = ehiz.a(context, attributeSet, ehag.a, R.attr.badgeStyle, i == 0 ? R.style.Widget_MaterialComponents_Badge : i, new int[0]);
        Resources resources = context.getResources();
        this.c = a.getDimensionPixelSize(5, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = a.getDimensionPixelSize(15, -1);
        this.e = a.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.g = a.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = a.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.h = a.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = a.getInt(25, 1);
        this.l = a.getInt(2, 0);
        int i3 = ehadVar.i;
        ehadVar2.i = i3 == -2 ? PrivateKeyType.INVALID : i3;
        int i4 = ehadVar.k;
        if (i4 != -2) {
            ehadVar2.k = i4;
        } else if (a.hasValue(24)) {
            ehadVar2.k = a.getInt(24, 0);
        } else {
            ehadVar2.k = -1;
        }
        String str = ehadVar.j;
        if (str != null) {
            ehadVar2.j = str;
        } else if (a.hasValue(8)) {
            ehadVar2.j = a.getString(8);
        }
        ehadVar2.o = ehadVar.o;
        CharSequence charSequence = ehadVar.p;
        ehadVar2.p = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        int i5 = ehadVar.q;
        ehadVar2.q = i5 == 0 ? R.plurals.mtrl_badge_content_description : i5;
        int i6 = ehadVar.r;
        ehadVar2.r = i6 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i6;
        Boolean bool = ehadVar.t;
        ehadVar2.t = Boolean.valueOf(bool == null || bool.booleanValue());
        int i7 = ehadVar.l;
        ehadVar2.l = i7 == -2 ? a.getInt(22, -2) : i7;
        int i8 = ehadVar.m;
        ehadVar2.m = i8 == -2 ? a.getInt(23, -2) : i8;
        Integer num = ehadVar.e;
        ehadVar2.e = Integer.valueOf(num == null ? a.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        Integer num2 = ehadVar.f;
        ehadVar2.f = Integer.valueOf(num2 == null ? a.getResourceId(7, 0) : num2.intValue());
        Integer num3 = ehadVar.g;
        ehadVar2.g = Integer.valueOf(num3 == null ? a.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        Integer num4 = ehadVar.h;
        ehadVar2.h = Integer.valueOf(num4 == null ? a.getResourceId(17, 0) : num4.intValue());
        Integer num5 = ehadVar.b;
        ehadVar2.b = Integer.valueOf(num5 == null ? k(context, a, 1) : num5.intValue());
        Integer num6 = ehadVar.d;
        ehadVar2.d = Integer.valueOf(num6 == null ? a.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = ehadVar.c;
        if (num7 != null) {
            ehadVar2.c = num7;
        } else if (a.hasValue(10)) {
            ehadVar2.c = Integer.valueOf(k(context, a, 10));
        } else {
            ehadVar2.c = Integer.valueOf(new ehmu(context, ehadVar2.d.intValue()).k.getDefaultColor());
        }
        Integer num8 = ehadVar.s;
        ehadVar2.s = Integer.valueOf(num8 == null ? a.getInt(3, 8388661) : num8.intValue());
        Integer num9 = ehadVar.u;
        ehadVar2.u = Integer.valueOf(num9 == null ? a.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        Integer num10 = ehadVar.v;
        ehadVar2.v = Integer.valueOf(num10 == null ? a.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        Integer num11 = ehadVar.w;
        ehadVar2.w = Integer.valueOf(num11 == null ? a.getDimensionPixelOffset(19, 0) : num11.intValue());
        Integer num12 = ehadVar.x;
        ehadVar2.x = Integer.valueOf(num12 == null ? a.getDimensionPixelOffset(26, 0) : num12.intValue());
        Integer num13 = ehadVar.y;
        ehadVar2.y = Integer.valueOf(num13 == null ? a.getDimensionPixelOffset(20, ehadVar2.w.intValue()) : num13.intValue());
        Integer num14 = ehadVar.z;
        ehadVar2.z = Integer.valueOf(num14 == null ? a.getDimensionPixelOffset(27, ehadVar2.x.intValue()) : num14.intValue());
        Integer num15 = ehadVar.C;
        ehadVar2.C = Integer.valueOf(num15 == null ? a.getDimensionPixelOffset(21, 0) : num15.intValue());
        Integer num16 = ehadVar.A;
        ehadVar2.A = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        Integer num17 = ehadVar.B;
        ehadVar2.B = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        Boolean bool2 = ehadVar.D;
        ehadVar2.D = Boolean.valueOf(bool2 == null ? a.getBoolean(0, false) : bool2.booleanValue());
        a.recycle();
        Locale locale = ehadVar.n;
        if (locale == null) {
            category = Locale.Category.FORMAT;
            locale = Locale.getDefault(category);
        }
        ehadVar2.n = locale;
        this.a = ehadVar;
    }

    private static int k(Context context, TypedArray typedArray, int i) {
        return ehmq.c(context, typedArray, i).getDefaultColor();
    }

    final int a() {
        return this.b.s.intValue();
    }

    final int b() {
        return this.b.f.intValue();
    }

    final int c() {
        return this.b.e.intValue();
    }

    final int d() {
        return this.b.h.intValue();
    }

    final int e() {
        return this.b.g.intValue();
    }

    public final int f() {
        return this.b.q;
    }

    public final int g() {
        return this.b.w.intValue();
    }

    final Locale h() {
        return this.b.n;
    }

    final boolean i() {
        return this.b.k != -1;
    }

    final boolean j() {
        return this.b.j != null;
    }
}
