package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eabz extends AppCompatTextView implements eabx {
    public boolean a;
    public boolean b;
    public boolean c;
    final int e;
    int f;
    int g;
    public dzyb h;
    public boolean i;
    private float[] j;
    private final int k;
    private final int l;
    private int m;
    private int n;
    private int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;

    public eabz(Context context) {
        super(dzyd.a(context, fdql.i()), null, R.attr.bubbleCellTextContentStyle);
        this.a = false;
        this.b = false;
        this.c = false;
        this.i = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, eabu.a, R.attr.bubbleCellTextContentStyle, R.style.LighterBubbleCellTextMessage);
        this.j = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        setPadding(getResources().getDimensionPixelSize(R.dimen.bubble_cell_content_start_end_padding), getResources().getDimensionPixelSize(R.dimen.bubble_cell_content_top_bottom_padding), getResources().getDimensionPixelSize(R.dimen.bubble_cell_content_start_end_padding), getResources().getDimensionPixelSize(R.dimen.bubble_cell_content_top_bottom_padding));
        setMaxWidth(dzyk.a(getContext(), 300.0f));
        this.k = ehga.a(R.dimen.m3_sys_elevation_level3, getContext());
        this.l = obtainStyledAttributes.getColor(2, ehdr.b(this, R.attr.colorPrimary));
        this.t = ehdr.b(this, R.attr.colorPrimary);
        this.u = ehdr.b(this, R.attr.colorOnSurfaceVariant);
        int resourceId = obtainStyledAttributes.getResourceId(1, R.style.IncomingBubbleCellTextMessage);
        this.p = resourceId;
        int resourceId2 = obtainStyledAttributes.getResourceId(3, R.style.OutgoingBubbleCellTextMessage);
        this.q = resourceId2;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, new int[]{android.R.attr.textColor});
        this.e = ehdr.b(this, R.attr.colorOnSurface);
        this.r = dzyk.b(ehdr.b(this, R.attr.colorPrimaryInverse), 128);
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(resourceId2, new int[]{android.R.attr.textColor});
        if (fdql.g()) {
            this.f = ehdr.b(this, R.attr.colorOnMessageBubbleOutgoingRcs);
        } else {
            this.f = ehdr.b(this, R.attr.colorOnPrimary);
        }
        this.s = dzyk.b(ehdr.b(this, R.attr.colorOnSurface), 128);
        obtainStyledAttributes3.recycle();
        obtainStyledAttributes.recycle();
        int[] iArr = kvo.a;
        setImportantForAccessibility(4);
    }

    static int e(int i) {
        float[] fArr = {r2, 0.0f, 0.0f};
        kps.j(i, fArr);
        float f = fArr[0] - 3.0f;
        return f < 0.0f ? i : kps.c(fArr);
    }

    private final void f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.m);
        int i = this.n;
        if (i != this.o) {
            if (fdql.m() && fdql.i() && dzyd.b(getResources().getConfiguration())) {
                int i2 = this.o;
                float[] fArr = {0.0f, 0.0f, r4};
                kps.j(i2, fArr);
                float f = fArr[2] + 0.03f;
                if (f <= 1.0f) {
                    i2 = kps.c(fArr);
                }
                this.o = i2;
            } else {
                this.n = e(this.n);
                this.o = e(this.o);
            }
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
            int[] iArr = {this.n, this.o};
            if (Build.VERSION.SDK_INT < 29) {
                gradientDrawable.setColors(iArr);
            } else if (fdql.m() && fdql.i() && dzyd.b(getResources().getConfiguration())) {
                gradientDrawable.setColors(iArr, new float[]{0.4f, 0.9f});
            } else {
                gradientDrawable.setColors(iArr, new float[]{0.2f, 0.8f});
            }
        } else {
            gradientDrawable.setColor(i);
        }
        gradientDrawable.setCornerRadii(this.j);
        setBackground(gradientDrawable);
    }

    @Override // defpackage.dzya
    public final /* synthetic */ void a(Object obj) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.view.View, android.widget.TextView, eabz] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v26, types: [kqx] */
    /* JADX WARN: Type inference failed for: r7v9, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
    @Override // defpackage.eabx
    public final void b(dzqs dzqsVar) {
        int i;
        ?? r5;
        int i2;
        int i3 = 1;
        if (dzqsVar.s() == 1) {
            setTextAppearance(this.p);
            i = this.e;
            int i4 = this.k;
            this.m = i4;
            this.n = i4;
            this.o = i4;
            this.g = this.t;
            setHighlightColor(this.r);
        } else {
            setTextAppearance(this.q);
            i = this.f;
            setHighlightColor(this.s);
            this.m = this.l;
            if (!fdql.g()) {
                this.f = ehdr.b(this, R.attr.colorOnMessageBubbleOutgoingRcs);
            }
            setTextColor(this.f);
            setLinkTextColor(this.f);
            this.n = ehdr.b(this, R.attr.colorMessageBubbleOutgoingRcsGradientStart);
            this.o = ehdr.b(this, R.attr.colorMessageBubbleOutgoingRcsGradientEnd);
            this.g = this.u;
        }
        f();
        if (this.c) {
            setTextIsSelectable(true);
            dzyj.a(this, this.g);
        }
        ?? r3 = 0;
        setLinksClickable(false);
        if (this.b) {
            setMovementMethod(new eacb(new eaby(this)));
        } else {
            setMovementMethod(new eaca());
        }
        int a = dzqsVar.h().a() - 1;
        if (a != 1) {
            int i5 = 3;
            if (a == 3 && this.a) {
                Context context = getContext();
                dzrw c = dzqsVar.h().c();
                emxc j = emxc.j(Integer.valueOf(i));
                ?? spannableStringBuilder = new SpannableStringBuilder();
                engw a2 = c.a();
                int i6 = ((enou) a2).c;
                int i7 = 0;
                while (i7 < i6) {
                    dzrh dzrhVar = (dzrh) a2.get(i7);
                    if (spannableStringBuilder.length() > 0 && !((Boolean) dzrhVar.d().e(Boolean.valueOf((boolean) r3))).booleanValue()) {
                        spannableStringBuilder.append("\n");
                    }
                    int length = dzrhVar.e().length();
                    if (dzrhVar.c().g()) {
                        String e = dzrhVar.e();
                        int ordinal = ((dzrq) dzrhVar.c().c()).ordinal();
                        emxc j2 = ordinal != i3 ? ordinal != 2 ? ordinal != i5 ? ordinal != 4 ? ordinal != 5 ? emux.a : emxc.j(Integer.valueOf(R.style.TextAppearance_GoogleMaterial3_LabelMedium)) : emxc.j(Integer.valueOf(R.style.TextAppearance_GoogleMaterial3_BodySmall)) : emxc.j(Integer.valueOf(R.style.TextAppearance_GoogleMaterial3_BodyMedium)) : emxc.j(Integer.valueOf(R.style.TextAppearance_GoogleMaterial3_TitleLarge)) : emxc.j(Integer.valueOf(R.style.TextAppearance_GoogleMaterial3_HeadlineLarge));
                        if (j2.g()) {
                            ?? spannableString = new SpannableString(((Integer) j2.c()).intValue() == 2132149977 ? e.toUpperCase(kqt.a(context.getResources().getConfiguration()).f(r3)) : e);
                            spannableString.setSpan(new TextAppearanceSpan(context, ((Integer) j2.c()).intValue()), r3, e.length(), 33);
                            r5 = spannableString;
                        } else {
                            r5 = new SpannableString(e);
                        }
                    } else {
                        r5 = new SpannableString(dzrhVar.e());
                    }
                    r5.setSpan(new ForegroundColorSpan(((Integer) ((emxn) j).a).intValue()), r3, dzrhVar.e().length(), 33);
                    if (dzrhVar.b().g()) {
                        engw a3 = ((engw) dzrhVar.b().c()).a();
                        int size = a3.size();
                        int i8 = r3;
                        while (i8 < size) {
                            int ordinal2 = ((dzrm) a3.get(i8)).a().ordinal();
                            emxc j3 = ordinal2 != i3 ? ordinal2 != 2 ? emux.a : emxc.j(new BulletSpan((int) context.getResources().getDimension(R.dimen.bullet_span_gap_width))) : emxc.j(new LeadingMarginSpan.Standard(dzyk.a(context, r15.b())));
                            if (j3.g()) {
                                r5.setSpan(j3.c(), 0, length, 33);
                            }
                            i8++;
                            i3 = 1;
                        }
                    }
                    if (dzrhVar.a().g()) {
                        Object c2 = dzrhVar.a().c();
                        int i9 = ((enou) c2).c;
                        int i10 = 0;
                        ?? r2 = c2;
                        while (i10 < i9) {
                            dzrj dzrjVar = (dzrj) r2.get(i10);
                            ArrayList arrayList = new ArrayList();
                            engw c3 = dzrjVar.c();
                            int i11 = ((enou) c3).c;
                            emxc emxcVar = j;
                            int i12 = 0;
                            Object obj = r2;
                            while (i12 < i11) {
                                int i13 = i12;
                                dzrr dzrrVar = (dzrr) c3.get(i12);
                                Object obj2 = obj;
                                int i14 = i9;
                                if (dzrt.BOLD.equals(dzrrVar.b()) || dzrt.ITALIC.equals(dzrrVar.b())) {
                                    arrayList.add(dzrrVar);
                                } else {
                                    dzyi.c(r5, dzrjVar, length, dzyi.b(context, dzrrVar));
                                }
                                i12 = i13 + 1;
                                obj = obj2;
                                i9 = i14;
                            }
                            Object obj3 = obj;
                            int i15 = i9;
                            int size2 = arrayList.size();
                            int i16 = 0;
                            while (true) {
                                i2 = i10 + 1;
                                if (i16 < size2) {
                                    dzyi.c(r5, dzrjVar, length, dzyi.b(context, (dzrr) arrayList.get(i16)));
                                    i16++;
                                }
                            }
                            j = emxcVar;
                            i10 = i2;
                            r2 = obj3;
                            i9 = i15;
                        }
                    }
                    spannableStringBuilder.append(r5);
                    i7++;
                    j = j;
                    i3 = 1;
                    r3 = 0;
                    i5 = 3;
                }
                boolean z = ((URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)).length > 0;
                this.i = z;
                if (z) {
                    eaau eaauVar = (eaau) this.h;
                    eaauVar.b.b(eaauVar.b(124).a());
                } else {
                    setAutoLinkMask(15);
                }
                setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            } else {
                setAutoLinkMask(15);
                setText((CharSequence) dzqsVar.k().e(""));
            }
        } else {
            setAutoLinkMask(15);
            setText(dzqsVar.h().d());
        }
        CharSequence text = getText();
        URLSpan[] uRLSpanArr = (URLSpan[]) new SpannableStringBuilder(text).getSpans(0, text.length(), URLSpan.class);
        HashSet<String> hashSet = new HashSet();
        for (URLSpan uRLSpan : uRLSpanArr) {
            hashSet.add(Uri.parse(uRLSpan.getURL()).getScheme());
        }
        for (String str : hashSet) {
            dzyb dzybVar = this.h;
            Integer num = (Integer) eaau.a.get(str);
            eaau eaauVar2 = (eaau) dzybVar;
            dzhn dzhnVar = eaauVar2.b;
            dzhl b = eaauVar2.b(124);
            b.k(num != null ? num.intValue() : 0);
            dzhnVar.b(b.a());
        }
    }

    @Override // defpackage.eabx
    public final void d(float f, float f2, float f3, float f4) {
        boolean a = dyhk.a(getContext());
        float f5 = true != a ? f : f2;
        if (true != a) {
            f = f2;
        }
        float f6 = true != a ? f4 : f3;
        if (true == a) {
            f3 = f4;
        }
        this.j = new float[]{dzyk.a(getContext(), f5), dzyk.a(getContext(), f5), dzyk.a(getContext(), f), dzyk.a(getContext(), f), dzyk.a(getContext(), f3), dzyk.a(getContext(), f3), dzyk.a(getContext(), f6), dzyk.a(getContext(), f6)};
        f();
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        int lineCount = layout.getLineCount();
        float f = 0.0f;
        for (int i3 = 0; i3 < lineCount; i3++) {
            float lineMax = layout.getLineMax(i3);
            if (lineMax > f) {
                f = lineMax;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) Math.ceil(f)) + getPaddingLeft() + getPaddingRight(), Integer.MIN_VALUE), i2);
    }

    @Override // defpackage.dzys
    public final void c() {
    }
}
