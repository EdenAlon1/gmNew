package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.util.StateSet;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxqh implements cskg {
    public Drawable a;
    public Drawable b;
    public Drawable c;
    public final Resources d;
    private float[] e;
    private float[] f;
    private float[] g;
    private float[] h;
    private float[] i;
    private float[] j;
    private float[] k;
    private Drawable l;
    private Drawable m;
    private final Context n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;

    public cxqh(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.n = context;
        this.d = context.getResources();
        this.o = ffbrVar;
        this.p = ffbrVar2;
        this.q = ffbrVar3;
        this.r = ffbrVar4;
        r();
    }

    static int a(int i) {
        float[] fArr = {r2, 0.0f, 0.0f};
        kps.j(i, fArr);
        float f = fArr[0] - 3.0f;
        return f < 0.0f ? i : kps.c(fArr);
    }

    public static int b(Context context) {
        return context.getColor(R.color.primary_brand_non_icon_color);
    }

    public static int c(Context context, boolean z) {
        return z ? context.getColor(R.color.attachment_selected_m2) : ehdr.d(context, R.attr.colorPrimaryBackground, "ConversationDrawables");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int e(String str) {
        char c;
        switch (str.hashCode()) {
            case -1248341670:
                if (str.equals("application/ics")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1248334925:
                if (str.equals("application/pdf")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1248330447:
                if (str.equals("application/txt")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1248329177:
                if (str.equals("application/vcs")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1073633483:
                if (str.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1071817359:
                if (str.equals("application/vnd.ms-powerpoint")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1050893613:
                if (str.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -958424608:
                if (str.equals("text/calendar")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 262346941:
                if (str.equals("text/x-vcalendar")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 326991069:
                if (str.equals("text/x-vCalendar")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 904647503:
                if (str.equals("application/msword")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1639365779:
                if (str.equals("application/hbs-vcs")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1993842850:
                if (str.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return R.drawable.quantum_ic_drive_pdf_black_24;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return R.drawable.quantum_ic_event_black_24;
            case 7:
            case '\b':
                return R.drawable.quantum_ic_drive_document_black_24;
            case '\t':
            case '\n':
                return R.drawable.quantum_ic_drive_presentation_black_24;
            case 11:
                return R.drawable.quantum_ic_drive_spreadsheet_black_24;
            case '\f':
                return R.drawable.quantum_ic_drive_text_black_24;
            default:
                return R.drawable.quantum_ic_insert_drive_file_white_24;
        }
    }

    public static int f(Context context) {
        return context.getColor(R.color.file_attachment_primary_text_m2);
    }

    public static int g(Context context) {
        return context.getColor(R.color.file_attachment_secondary_text);
    }

    public static int h(Context context) {
        return ehdr.d(context, R.attr.colorPrimaryBrandIcon, "ConversationDrawables");
    }

    public static Drawable i(Context context) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        int dimension = (int) context.getResources().getDimension(R.dimen.file_icon_background_size);
        shapeDrawable.setIntrinsicHeight(dimension);
        shapeDrawable.setIntrinsicWidth(dimension);
        return ctap.j(context, shapeDrawable, ehdr.d(context, R.attr.colorPrimaryBrandIcon, "ConversationDrawables"));
    }

    public static Drawable k(Context context) {
        GradientDrawable u = u(context.getColor(R.color.message_transfer_background));
        u.setStroke(context.getResources().getDimensionPixelSize(R.dimen.message_transfer_progress_border), context.getColor(R.color.message_transfer_border));
        return u;
    }

    public static GradientDrawable o(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke((int) context.getResources().getDimension(R.dimen.file_preview_background_border), ehdr.d(context, R.attr.colorOutlineVariant, "ConversationDrawables"));
        gradientDrawable.setCornerRadius((int) context.getResources().getDimension(R.dimen.file_attachment_rounded_corner_radius));
        return gradientDrawable;
    }

    private static GradientDrawable u(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    private final boolean v() {
        return ((cuxh) this.p.b()).d();
    }

    private static int[] w(int i) {
        return new int[]{i};
    }

    public final int d() {
        return this.n.getColor(R.color.primary_brand_icon_color);
    }

    public final Drawable j(Context context, boolean z) {
        if (z) {
            if (this.m == null) {
                this.m = this.d.getDrawable(R.drawable.fastscroll_thumb_pressed);
            }
            return ctap.j(context, this.m, b(context));
        }
        int color = context.getColor(R.color.fastscroll_tint_color);
        if (this.l == null) {
            this.l = this.d.getDrawable(R.drawable.fastscroll_thumb);
        }
        Drawable drawable = this.l;
        drawable.getClass();
        return ctap.j(context, drawable, color);
    }

    @Override // defpackage.cskg
    public final void l(int i) {
        this.c = null;
        this.l = null;
        this.m = null;
        this.a = null;
        this.b = null;
    }

    public final Drawable m(Context context, int i, boolean z) {
        Drawable a;
        if (z) {
            bzyb bzybVar = (bzyb) this.q.b();
            if (i == 40 && bzwd.f()) {
                a = bzybVar.a.getDrawable(R.drawable.ic_e2ee_send_icon);
                a.getClass();
            } else {
                if (bzybVar.b.isEmpty()) {
                    throw new IllegalStateException("Cannot provide scheduled send button icon with missing ScheduledSendResources. Is the module missing?");
                }
                Context context2 = bzybVar.a;
                bzybVar.b.get();
                a = context2.getDrawable(R.drawable.scheduled_send_button_icon);
                a.getClass();
            }
        } else {
            a = ((bzyb) this.q.b()).a(i);
        }
        Drawable j = ctap.j(context, a, h(context));
        Drawable j2 = ctap.j(context, a, context.getColor(R.color.c2o_send_button_disabled_color_m2));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, j2);
        stateListDrawable.addState(StateSet.WILD_CARD, j);
        return stateListDrawable;
    }

    public final Drawable n() {
        return u(d());
    }

    public final GradientDrawable p(int[] iArr, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        float[] s = s(z, z2, z3, z4, z5);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(s);
        if (iArr.length <= 1) {
            gradientDrawable.setColor(iArr[0]);
            return gradientDrawable;
        }
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        if (Build.VERSION.SDK_INT < 29) {
            gradientDrawable.setColors(iArr);
            return gradientDrawable;
        }
        if (((crjx) this.o.b()).g()) {
            gradientDrawable.setColors(iArr, new float[]{0.4f, 0.9f});
            return gradientDrawable;
        }
        gradientDrawable.setColors(iArr, new float[]{0.2f, 0.8f});
        return gradientDrawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cxqe q(android.content.Context r6, defpackage.cxqg r7) {
        /*
            r5 = this;
            cxpr r7 = (defpackage.cxpr) r7
            boolean r0 = r7.d
            r1 = 3
            java.lang.String r2 = "ConversationDrawables"
            if (r0 == 0) goto L21
            boolean r0 = r7.a
            if (r0 == 0) goto L11
            r0 = 2130969221(0x7f040285, float:1.7547118E38)
            goto L1c
        L11:
            int r0 = r7.e
            if (r0 != r1) goto L19
            r0 = 2130969224(0x7f040288, float:1.7547124E38)
            goto L1c
        L19:
            r0 = 2130969226(0x7f04028a, float:1.7547128E38)
        L1c:
            int r0 = defpackage.ehdr.d(r6, r0, r2)
            goto L66
        L21:
            ffbr r0 = r5.r
            java.lang.Object r0 = r0.b()
            bzqa r0 = (defpackage.bzqa) r0
            boolean r0 = r0.n()
            if (r0 == 0) goto L3f
            int r0 = r7.b
            boolean r0 = com.google.android.apps.messaging.shared.datamodel.data.MessageData.cl(r0)
            if (r0 == 0) goto L3f
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
            int r0 = r6.getColor(r0)
            goto L66
        L3f:
            boolean r0 = r7.a
            if (r0 == 0) goto L53
            int r0 = r7.e
            if (r0 != r1) goto L4b
            r0 = 2130969220(0x7f040284, float:1.7547116E38)
            goto L4e
        L4b:
            r0 = 2130969222(0x7f040286, float:1.754712E38)
        L4e:
            int r0 = defpackage.ehdr.d(r6, r0, r2)
            goto L66
        L53:
            int r0 = r7.e
            if (r0 != r1) goto L5f
            r0 = 2130969223(0x7f040287, float:1.7547122E38)
            int r0 = defpackage.ehdr.d(r6, r0, r2)
            goto L66
        L5f:
            r0 = 2130969225(0x7f040289, float:1.7547126E38)
            int r0 = defpackage.ehdr.d(r6, r0, r2)
        L66:
            int r1 = r7.b
            r3 = 8
            r4 = 2130969196(0x7f04026c, float:1.7547067E38)
            if (r1 == r3) goto L8e
            r3 = 9
            if (r1 == r3) goto L8e
            r3 = 13
            if (r1 == r3) goto L8e
            r3 = 24
            if (r1 == r3) goto L8e
            r3 = 107(0x6b, float:1.5E-43)
            if (r1 == r3) goto L8e
            r3 = 18
            if (r1 == r3) goto L8e
            r3 = 19
            if (r1 == r3) goto L8e
            switch(r1) {
                case 111: goto L8e;
                case 112: goto L8e;
                case 113: goto L8e;
                case 114: goto L8e;
                default: goto L8a;
            }
        L8a:
            r1 = 2130969255(0x7f0402a7, float:1.7547187E38)
            goto L8f
        L8e:
            r1 = r4
        L8f:
            r3 = 1
            boolean r7 = r7.c
            if (r3 != r7) goto L95
            goto L96
        L95:
            r4 = r1
        L96:
            cxpp r7 = new cxpp
            int r6 = defpackage.ehdr.d(r6, r4, r2)
            r7.<init>(r0, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxqh.q(android.content.Context, cxqg):cxqe");
    }

    public final void r() {
        Resources resources = this.d;
        float dimension = resources.getDimension(R.dimen.conversation_bubble_small_corner);
        float dimension2 = resources.getDimension(R.dimen.conversation_bubble_large_corner);
        this.e = new float[]{dimension2, dimension2, dimension2, dimension2, dimension2, dimension2, dimension2, dimension2};
        this.f = new float[]{dimension, dimension, dimension2, dimension2, dimension2, dimension2, dimension2, dimension2};
        this.h = new float[]{dimension, dimension, dimension2, dimension2, dimension2, dimension2, dimension, dimension};
        this.g = new float[]{dimension2, dimension2, dimension2, dimension2, dimension2, dimension2, dimension, dimension};
        this.i = new float[]{dimension2, dimension2, dimension, dimension, dimension2, dimension2, dimension2, dimension2};
        this.k = new float[]{dimension2, dimension2, dimension, dimension, dimension, dimension, dimension2, dimension2};
        this.j = new float[]{dimension2, dimension2, dimension2, dimension2, dimension, dimension, dimension2, dimension2};
    }

    public final float[] s(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        float[] fArr = this.e;
        if (!z ? v() : !v()) {
            if (!z3) {
                z6 = false;
            } else if (z2) {
                fArr = this.k;
            } else {
                z6 = true;
                z2 = false;
            }
            if (z6) {
                fArr = this.j;
            } else if (z2) {
                fArr = this.i;
            }
        } else {
            if (!z3) {
                z7 = false;
            } else if (z2) {
                fArr = this.h;
            } else {
                z7 = true;
                z2 = false;
            }
            if (z7) {
                fArr = this.g;
            } else if (z2) {
                fArr = this.f;
            }
        }
        if (z4) {
            fArr = (float[]) fArr.clone();
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
        }
        if (!z5) {
            return fArr;
        }
        float[] fArr2 = (float[]) fArr.clone();
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[3] = 0.0f;
        return fArr2;
    }

    public final int[] t(Context context, boolean z, boolean z2, int i) {
        if (z) {
            return w(z2 ? ehdr.d(context, R.attr.colorMessageBubbleIncomingSelected, "ConversationDrawables") : i == 3 ? ehdr.d(context, R.attr.colorMessageBubbleOutgoingRcsSelected, "ConversationDrawables") : ehdr.d(context, R.attr.colorMessageBubbleOutgoingXmsSelected, "ConversationDrawables"));
        }
        if (z2) {
            return i == 3 ? w(ehdr.d(context, R.attr.colorSurfaceContainerHigh, "ConversationDrawables")) : w(ehdr.d(context, R.attr.colorMessageBubbleIncomingXms, "ConversationDrawables"));
        }
        if (i != 3) {
            return w(ehdr.d(context, R.attr.colorMessageBubbleOutgoingXms, "ConversationDrawables"));
        }
        int d = ehdr.d(context, R.attr.colorMessageBubbleOutgoingRcsGradientStart, "ConversationDrawables");
        int d2 = ehdr.d(context, R.attr.colorMessageBubbleOutgoingRcsGradientEnd, "ConversationDrawables");
        boolean z3 = d != d2;
        if (z3 && !((crjx) this.o.b()).g()) {
            d = a(d);
            d2 = a(d2);
        }
        if (z3 && ((crjx) this.o.b()).g()) {
            float[] fArr = {0.0f, 0.0f, r1};
            kps.j(d2, fArr);
            float f = fArr[2] + 0.03f;
            if (f <= 1.0f) {
                d2 = kps.c(fArr);
            }
        }
        return new int[]{d, d2};
    }
}
