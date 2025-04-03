package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.car.app.model.Alert;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jae extends ktb {
    public static final cmw a = cmx.a(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);
    public final cnw A;
    public jfs B;
    public boolean C;
    public final Runnable D;
    public final List E;
    private final long H;
    private final izw I;
    private final cmj J;
    private final ffwm K;
    private cmy L;
    private final jxn M;
    private final ffji N;
    public final AndroidComposeView b;
    public final AccessibilityManager d;
    public final AccessibilityManager.AccessibilityStateChangeListener e;
    public final AccessibilityManager.TouchExplorationStateChangeListener f;
    public List g;
    public final Handler h;
    public int i;
    public int j;
    public kxu k;
    public kxu l;
    public boolean m;
    public final cnw n;
    public final cnw o;
    public final cpo p;
    public final cpo q;
    public int r;
    public Integer s;
    public boolean t;
    public izx u;
    public final cnx v;
    public final cnu w;
    public final cnu x;
    public final String y;
    public final String z;
    public int c = Integer.MIN_VALUE;
    private final ffji G = new izz(this);

    public jae(AndroidComposeView androidComposeView) {
        this.b = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.d = accessibilityManager;
        this.H = 100L;
        this.e = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: izs
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                jae jaeVar = jae.this;
                jaeVar.g = z ? jaeVar.d.getEnabledAccessibilityServiceList(-1) : ffel.a;
            }
        };
        this.f = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: izt
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                jae jaeVar = jae.this;
                jaeVar.g = jaeVar.d.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.g = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.h = new Handler(Looper.getMainLooper());
        this.I = new izw(this);
        this.i = Integer.MIN_VALUE;
        this.j = Integer.MIN_VALUE;
        this.n = new cnw((byte[]) null);
        this.o = new cnw((byte[]) null);
        this.p = new cpo(null);
        this.q = new cpo(null);
        this.r = -1;
        this.J = new cmj((byte[]) null);
        this.K = ffwp.a(1, 0, 6);
        this.t = true;
        this.L = cmz.a();
        this.v = new cnx((byte[]) null);
        this.w = new cnu(null);
        this.x = new cnu(null);
        this.y = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.z = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.M = new jxn();
        this.A = new cnw((byte[]) null);
        this.B = new jfs(androidComposeView.l.a(), cmz.a());
        androidComposeView.addOnAttachStateChangeListener(new izv(this));
        this.D = new Runnable() { // from class: izu
            /* JADX WARN: Code restructure failed: missing block: B:100:0x02a0, code lost:
            
                if (r3.f(defpackage.jjl.j) == false) goto L141;
             */
            /* JADX WARN: Code restructure failed: missing block: B:101:0x02a2, code lost:
            
                r3 = defpackage.jae.K(r6.a);
             */
            /* JADX WARN: Code restructure failed: missing block: B:102:0x02a8, code lost:
            
                if (r3 != null) goto L102;
             */
            /* JADX WARN: Code restructure failed: missing block: B:103:0x02aa, code lost:
            
                r3 = "";
             */
            /* JADX WARN: Code restructure failed: missing block: B:104:0x02ab, code lost:
            
                r4 = defpackage.jae.K(r7.c);
             */
            /* JADX WARN: Code restructure failed: missing block: B:105:0x02b1, code lost:
            
                if (r4 != 0) goto L105;
             */
            /* JADX WARN: Code restructure failed: missing block: B:107:0x02b5, code lost:
            
                r4 = defpackage.jae.M(r12);
                r8 = r3.length();
                r1 = r12.length();
                r10 = defpackage.ffmk.g(r8, r1);
                r1 = r26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:108:0x02c9, code lost:
            
                if (r1 >= r10) goto L363;
             */
            /* JADX WARN: Code restructure failed: missing block: B:109:0x02cb, code lost:
            
                r44 = r8;
                r45 = r10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:110:0x02d7, code lost:
            
                if (r3.charAt(r1) == r12.charAt(r1)) goto L111;
             */
            /* JADX WARN: Code restructure failed: missing block: B:111:0x02da, code lost:
            
                r1 = r1 + 1;
                r8 = r44;
                r10 = r45;
             */
            /* JADX WARN: Code restructure failed: missing block: B:114:0x02e5, code lost:
            
                r8 = r26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:116:0x02e9, code lost:
            
                if (r8 >= (r45 - r1)) goto L364;
             */
            /* JADX WARN: Code restructure failed: missing block: B:117:0x02eb, code lost:
            
                r47 = r8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:118:0x02fc, code lost:
            
                if (r3.charAt((r44 - 1) - r8) == r12.charAt((r1 - 1) - r47)) goto L119;
             */
            /* JADX WARN: Code restructure failed: missing block: B:119:0x02ff, code lost:
            
                r8 = r47 + 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:122:0x0304, code lost:
            
                r8 = (r44 - r47) - r1;
                r10 = (r1 - r47) - r1;
                r44 = r14;
                r12 = r6.a.f(defpackage.jkm.H);
                r45 = r7;
                r7 = r7.c.f(defpackage.jkm.H);
                r46 = r6;
                r6 = r6.a.f(defpackage.jkm.C);
             */
            /* JADX WARN: Code restructure failed: missing block: B:123:0x0328, code lost:
            
                if (r6 == false) goto L126;
             */
            /* JADX WARN: Code restructure failed: missing block: B:124:0x032a, code lost:
            
                if (r12 != false) goto L126;
             */
            /* JADX WARN: Code restructure failed: missing block: B:125:0x032c, code lost:
            
                if (r7 == false) goto L126;
             */
            /* JADX WARN: Code restructure failed: missing block: B:126:0x032e, code lost:
            
                r14 = 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:127:0x0333, code lost:
            
                if (r6 == false) goto L131;
             */
            /* JADX WARN: Code restructure failed: missing block: B:128:0x0335, code lost:
            
                if (r12 == false) goto L131;
             */
            /* JADX WARN: Code restructure failed: missing block: B:129:0x0337, code lost:
            
                if (r7 != false) goto L131;
             */
            /* JADX WARN: Code restructure failed: missing block: B:131:0x033c, code lost:
            
                if (r14 != 0) goto L136;
             */
            /* JADX WARN: Code restructure failed: missing block: B:132:0x033e, code lost:
            
                if (r39 == 0) goto L135;
             */
            /* JADX WARN: Code restructure failed: missing block: B:134:0x0341, code lost:
            
                r6 = r2.o(r2.m(r5), 16);
                r6.setFromIndex(r1);
                r6.setRemovedCount(r8);
                r6.setAddedCount(r10);
                r6.setBeforeText(r3);
                r6.getText().add(r4);
                r12 = r5;
                r10 = r20;
                r1 = r45;
                r8 = r46;
                r20 = r14;
                r14 = r34;
                r34 = r15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:135:0x0390, code lost:
            
                r6.setClassName("android.widget.EditText");
                r2.O(r6);
             */
            /* JADX WARN: Code restructure failed: missing block: B:136:0x0398, code lost:
            
                if (r20 != 0) goto L140;
             */
            /* JADX WARN: Code restructure failed: missing block: B:137:0x039a, code lost:
            
                if (r39 == 0) goto L352;
             */
            /* JADX WARN: Code restructure failed: missing block: B:139:0x039c, code lost:
            
                r3 = ((defpackage.jpm) r1.c.b(defpackage.jkm.D)).b;
                r6.setFromIndex(defpackage.jpm.e(r3));
                r6.setToIndex(defpackage.jpm.a(r3));
                r2.O(r6);
             */
            /* JADX WARN: Code restructure failed: missing block: B:141:0x036e, code lost:
            
                r3 = r2.m(r5);
                r4 = java.lang.Integer.valueOf(r26);
                r6 = java.lang.Integer.valueOf(r1);
                r12 = r5;
                r10 = r20;
                r1 = r45;
                r8 = r46;
                r20 = r14;
                r14 = r34;
                r34 = r15;
                r6 = r2.p(r3, r4, r4, r6, r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:142:0x033a, code lost:
            
                r39 = r26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:143:0x0331, code lost:
            
                r14 = r26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:145:0x0302, code lost:
            
                r47 = r8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:147:0x02e1, code lost:
            
                r44 = r8;
                r45 = r10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:148:0x02b4, code lost:
            
                r12 = r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:149:0x03bb, code lost:
            
                r12 = r5;
                r8 = r6;
                r1 = r7;
                r44 = r14;
                r14 = r34;
                r34 = r15;
                r10 = r20;
                defpackage.jae.J(r2, r2.m(r12), 2048, 2, 8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:151:0x03d7, code lost:
            
                r8 = r6;
                r1 = r7;
                r44 = r14;
                r14 = r34;
                r34 = r15;
                r10 = r20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:152:0x03e8, code lost:
            
                if (defpackage.ffkj.e(r4, defpackage.jkm.D) == false) goto L151;
             */
            /* JADX WARN: Code restructure failed: missing block: B:153:0x03ea, code lost:
            
                r3 = defpackage.jae.K(r1.c);
             */
            /* JADX WARN: Code restructure failed: missing block: B:154:0x03f0, code lost:
            
                if (r3 == null) goto L150;
             */
            /* JADX WARN: Code restructure failed: missing block: B:155:0x03f2, code lost:
            
                r3 = r3.b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:156:0x03f4, code lost:
            
                if (r3 != null) goto L149;
             */
            /* JADX WARN: Code restructure failed: missing block: B:158:0x03f7, code lost:
            
                r12 = r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:159:0x03f8, code lost:
            
                r3 = ((defpackage.jpm) r1.c.b(defpackage.jkm.D)).b;
                r3 = r2.m(r5);
                r4 = java.lang.Integer.valueOf(defpackage.jpm.e(r3));
                r6 = java.lang.Integer.valueOf(defpackage.jpm.a(r3));
                r7 = java.lang.Integer.valueOf(r12.length());
                r12 = defpackage.jae.M(r12);
                r12 = r5;
                r2.O(r2.p(r3, r4, r6, r7, r12));
                r2.y(r1.e);
             */
            /* JADX WARN: Code restructure failed: missing block: B:161:0x043a, code lost:
            
                r12 = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:162:0x0441, code lost:
            
                if (defpackage.ffkj.e(r4, defpackage.jkm.s) == false) goto L154;
             */
            /* JADX WARN: Code restructure failed: missing block: B:164:0x0524, code lost:
            
                r2.u(r1.b);
                r3 = defpackage.jfu.c(r2.E, r12);
                r3.getClass();
                r3.d = (defpackage.jjk) defpackage.jjo.a(r1.c, defpackage.jkm.s);
                r3.e = (defpackage.jjk) defpackage.jjo.a(r1.c, defpackage.jkm.t);
                r2.v(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:167:0x044b, code lost:
            
                if (defpackage.ffkj.e(r4, defpackage.jkm.t) != false) goto L200;
             */
            /* JADX WARN: Code restructure failed: missing block: B:169:0x0453, code lost:
            
                if (defpackage.ffkj.e(r4, defpackage.jkm.k) == false) goto L162;
             */
            /* JADX WARN: Code restructure failed: missing block: B:170:0x0455, code lost:
            
                r3.getClass();
             */
            /* JADX WARN: Code restructure failed: missing block: B:171:0x045e, code lost:
            
                if (((java.lang.Boolean) r3).booleanValue() == false) goto L161;
             */
            /* JADX WARN: Code restructure failed: missing block: B:172:0x0460, code lost:
            
                r2.O(r2.o(r2.m(r1.e), 8));
             */
            /* JADX WARN: Code restructure failed: missing block: B:173:0x046d, code lost:
            
                defpackage.jae.J(r2, r2.m(r1.e), 2048, java.lang.Integer.valueOf(r26), 8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:175:0x047e, code lost:
            
                r5 = defpackage.jjl.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:176:0x0486, code lost:
            
                if (defpackage.ffkj.e(r4, defpackage.jjl.w) == false) goto L180;
             */
            /* JADX WARN: Code restructure failed: missing block: B:177:0x0488, code lost:
            
                r3 = (java.util.List) r1.c.b(defpackage.jjl.w);
                r4 = (java.util.List) defpackage.jjo.a(r8.a, defpackage.jjl.w);
             */
            /* JADX WARN: Code restructure failed: missing block: B:178:0x049c, code lost:
            
                if (r4 == null) goto L177;
             */
            /* JADX WARN: Code restructure failed: missing block: B:179:0x049e, code lost:
            
                r5 = new java.util.LinkedHashSet();
                r6 = r3.size();
                r7 = r26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:180:0x04a9, code lost:
            
                if (r7 >= r6) goto L366;
             */
            /* JADX WARN: Code restructure failed: missing block: B:181:0x04ab, code lost:
            
                r5.add(((defpackage.jjf) r3.get(r7)).a);
                r7 = r7 + 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:183:0x04bd, code lost:
            
                r3 = new java.util.LinkedHashSet();
                r6 = r4.size();
                r7 = r26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:184:0x04c8, code lost:
            
                if (r7 >= r6) goto L367;
             */
            /* JADX WARN: Code restructure failed: missing block: B:185:0x04ca, code lost:
            
                r3.add(((defpackage.jjf) r4.get(r7)).a);
                r7 = r7 + 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:188:0x04dc, code lost:
            
                if (r5.containsAll(r3) == false) goto L199;
             */
            /* JADX WARN: Code restructure failed: missing block: B:190:0x04e2, code lost:
            
                if (r3.containsAll(r5) != false) goto L184;
             */
            /* JADX WARN: Code restructure failed: missing block: B:192:0x04fc, code lost:
            
                r32 = r26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:194:0x0521, code lost:
            
                r32 = 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:197:0x04e9, code lost:
            
                if (r3.isEmpty() != false) goto L357;
             */
            /* JADX WARN: Code restructure failed: missing block: B:201:0x04ee, code lost:
            
                if ((r3 instanceof defpackage.jjb) == false) goto L199;
             */
            /* JADX WARN: Code restructure failed: missing block: B:202:0x04f0, code lost:
            
                r3 = (defpackage.jjb) r3;
                r4 = defpackage.jjo.a(r8.a, r4);
                r5 = defpackage.jan.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:203:0x04fa, code lost:
            
                if (r3 != r4) goto L185;
             */
            /* JADX WARN: Code restructure failed: missing block: B:205:0x0502, code lost:
            
                if ((r4 instanceof defpackage.jjb) != false) goto L188;
             */
            /* JADX WARN: Code restructure failed: missing block: B:207:0x0505, code lost:
            
                r4 = (defpackage.jjb) r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:208:0x050f, code lost:
            
                if (defpackage.ffkj.e(r3.a, r4.a) != false) goto L191;
             */
            /* JADX WARN: Code restructure failed: missing block: B:210:0x0512, code lost:
            
                r3 = r3.b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:211:0x0514, code lost:
            
                if (r3 != null) goto L196;
             */
            /* JADX WARN: Code restructure failed: missing block: B:213:0x0518, code lost:
            
                if (r4.b == null) goto L196;
             */
            /* JADX WARN: Code restructure failed: missing block: B:215:0x051b, code lost:
            
                if (r3 == null) goto L184;
             */
            /* JADX WARN: Code restructure failed: missing block: B:217:0x051f, code lost:
            
                if (r4.b != null) goto L184;
             */
            /* JADX WARN: Code restructure failed: missing block: B:222:0x011c, code lost:
            
                if (r41 == 0) goto L48;
             */
            /* JADX WARN: Code restructure failed: missing block: B:321:0x07ba, code lost:
            
                r23 = r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:322:0x07c4, code lost:
            
                if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L281;
             */
            /* JADX WARN: Code restructure failed: missing block: B:325:0x07c6, code lost:
            
                r15 = -1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:377:0x08b3, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:379:0x08b7, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:383:0x08bd, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:385:0x08c1, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0128, code lost:
            
                if (defpackage.ffkj.e(r3, defpackage.jjo.a(r6.a, r4)) != false) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x012a, code lost:
            
                r8 = r6;
                r1 = r7;
                r42 = r10;
                r25 = r12;
                r44 = r14;
                r10 = r20;
                r14 = r34;
                r12 = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
            
                if (defpackage.ffkj.e(r4, defpackage.jkm.d) == false) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0141, code lost:
            
                r3.getClass();
                r3 = (java.lang.String) r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x014e, code lost:
            
                if (r6.a.f(defpackage.jkm.d) == false) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x0150, code lost:
            
                r2.x(r5, r29, r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x015e, code lost:
            
                if (defpackage.ffkj.e(r4, defpackage.jkm.b) == false) goto L59;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x0160, code lost:
            
                r1 = r7;
                r42 = r10;
                r25 = r12;
                r44 = r14;
                r10 = r20;
                r14 = r34;
                r12 = r5;
                r8 = r6;
                r34 = r15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x054e, code lost:
            
                defpackage.jae.J(r2, r2.m(r12), 2048, 64, 8);
                defpackage.jae.J(r2, r2.m(r12), 2048, java.lang.Integer.valueOf(r26), 8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x0179, code lost:
            
                if (defpackage.ffkj.e(r4, defpackage.jkm.G) != false) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x0181, code lost:
            
                if (defpackage.ffkj.e(r4, defpackage.jkm.c) == false) goto L64;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x0183, code lost:
            
                defpackage.jae.J(r2, r2.m(r5), 2048, 64, 8);
                defpackage.jae.J(r2, r2.m(r5), 2048, java.lang.Integer.valueOf(r26), 8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x01a7, code lost:
            
                if (defpackage.ffkj.e(r4, defpackage.jkm.F) == false) goto L90;
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x01a9, code lost:
            
                r1 = (defpackage.jjj) defpackage.jjo.a(r7.c, defpackage.jkm.w);
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:0x01b3, code lost:
            
                if (r1 != null) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x01b5, code lost:
            
                r42 = r10;
                r25 = r12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:71:0x0245, code lost:
            
                defpackage.jae.J(r2, r2.m(r5), 2048, 64, 8);
                defpackage.jae.J(r2, r2.m(r5), 2048, java.lang.Integer.valueOf(r26), 8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x0281, code lost:
            
                r12 = r5;
                r8 = r6;
                r1 = r7;
                r44 = r14;
                r10 = r20;
                r14 = r34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01c2, code lost:
            
                if (defpackage.jjj.a(r1.a, 4) == false) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:76:0x01d4, code lost:
            
                if (defpackage.ffkj.e(defpackage.jjo.a(r7.c, defpackage.jkm.F), true) == false) goto L88;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x01d6, code lost:
            
                r1 = r2.o(r2.m(r5), 4);
                r3 = r7.f();
                r4 = (java.util.List) defpackage.jjo.a(r3.e(), defpackage.jkm.a);
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:0x01f4, code lost:
            
                if (r4 == null) goto L78;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x01f6, code lost:
            
                r42 = r10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x01f9, code lost:
            
                r10 = defpackage.kau.d(r4, ",", null, 62);
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x0202, code lost:
            
                r4 = (java.util.List) defpackage.jjo.a(r3.e(), defpackage.jkm.z);
             */
            /* JADX WARN: Code restructure failed: missing block: B:83:0x020e, code lost:
            
                if (r4 == null) goto L82;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x0210, code lost:
            
                r25 = r12;
                r3 = defpackage.kau.d(r4, ",", null, 62);
             */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x021e, code lost:
            
                if (r10 == null) goto L85;
             */
            /* JADX WARN: Code restructure failed: missing block: B:86:0x0220, code lost:
            
                r1.setContentDescription(r10);
             */
            /* JADX WARN: Code restructure failed: missing block: B:87:0x0223, code lost:
            
                if (r3 == null) goto L87;
             */
            /* JADX WARN: Code restructure failed: missing block: B:88:0x0225, code lost:
            
                r1.getText().add(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:89:0x022c, code lost:
            
                r2.O(r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:90:0x021a, code lost:
            
                r25 = r12;
                r3 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x01ff, code lost:
            
                r42 = r10;
                r10 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x0230, code lost:
            
                r42 = r10;
                r25 = r12;
                defpackage.jae.J(r2, r2.m(r5), 2048, java.lang.Integer.valueOf(r26), 8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x0260, code lost:
            
                r42 = r10;
                r25 = r12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x026d, code lost:
            
                if (defpackage.ffkj.e(r4, defpackage.jkm.a) == false) goto L94;
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x026f, code lost:
            
                r4 = r2.m(r5);
                r3.getClass();
                r2.L(r4, 2048, 4, (java.util.List) r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x0292, code lost:
            
                r12 = "";
             */
            /* JADX WARN: Code restructure failed: missing block: B:98:0x0294, code lost:
            
                if (defpackage.ffkj.e(r4, defpackage.jkm.C) == false) goto L142;
             */
            /* JADX WARN: Code restructure failed: missing block: B:99:0x0296, code lost:
            
                r3 = r7.c;
                r4 = defpackage.jjl.a;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v31, types: [java.util.Collection, java.util.LinkedHashSet, java.util.Set] */
            /* JADX WARN: Type inference failed for: r4v38, types: [jlm] */
            /* JADX WARN: Type inference failed for: r5v38, types: [java.util.Collection, java.util.LinkedHashSet, java.util.Set] */
            /* JADX WARN: Type inference failed for: r7v0, types: [boolean] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 2247
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.izu.run():void");
            }
        };
        this.E = new ArrayList();
        this.N = new jab(this);
    }

    public static final boolean F(jjk jjkVar, float f) {
        if (f >= 0.0f || ((Number) jjkVar.a.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) jjkVar.a.invoke()).floatValue() < ((Number) jjkVar.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean G(jjk jjkVar) {
        if (((Number) jjkVar.a.invoke()).floatValue() <= 0.0f || jjkVar.c) {
            return ((Number) jjkVar.a.invoke()).floatValue() < ((Number) jjkVar.b.invoke()).floatValue() && jjkVar.c;
        }
        return true;
    }

    public static final boolean H(jjk jjkVar) {
        if (((Number) jjkVar.a.invoke()).floatValue() >= ((Number) jjkVar.b.invoke()).floatValue() || jjkVar.c) {
            return ((Number) jjkVar.a.invoke()).floatValue() > 0.0f && jjkVar.c;
        }
        return true;
    }

    static /* synthetic */ void J(jae jaeVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        jaeVar.L(i, i2, num, null);
    }

    public static final jlm K(jjn jjnVar) {
        jku jkuVar = jkm.a;
        return (jlm) jjo.a(jjnVar, jkm.C);
    }

    public static final CharSequence M(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i = 100000;
        if (charSequence.length() <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
            i = 99999;
        }
        CharSequence subSequence = charSequence.subSequence(0, i);
        subSequence.getClass();
        return subSequence;
    }

    public static final String N(jjw jjwVar) {
        List list;
        jlm jlmVar;
        if (jjwVar != null) {
            jku jkuVar = jkm.a;
            if (jjwVar.c.f(jkm.a)) {
                return kau.d((List) jjwVar.c.b(jkm.a), ",", null, 62);
            }
            if (!jjwVar.c.f(jkm.C) ? !((list = (List) jjo.a(jjwVar.c, jkm.z)) == null || (jlmVar = (jlm) ffdx.M(list)) == null) : (jlmVar = K(jjwVar.c)) != null) {
                return jlmVar.b;
            }
        }
        return null;
    }

    public static final float j(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    public final void A(int i) {
        int i2 = this.c;
        if (i2 == i) {
            return;
        }
        this.c = i;
        J(this, i, 128, null, 12);
        J(this, i2, 256, null, 12);
    }

    public final boolean B(boolean z, int i, long j) {
        jku jkuVar;
        int i2;
        int i3;
        char c;
        jjk jjkVar;
        int i4;
        int i5 = 0;
        if (!ffkj.e(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        cmy q = q();
        if (!iak.i(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
            if (z) {
                jku jkuVar2 = jkm.a;
                jkuVar = jkm.t;
            } else {
                jku jkuVar3 = jkm.a;
                jkuVar = jkm.s;
            }
            Object[] objArr = q.c;
            long[] jArr = q.a;
            int length = jArr.length - 2;
            if (length < 0) {
                return false;
            }
            int i6 = 0;
            boolean z2 = false;
            while (true) {
                long j2 = jArr[i6];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = i6 - length;
                    int i8 = i5;
                    while (true) {
                        i2 = i5;
                        i3 = 8 - ((~i7) >>> 31);
                        if (i8 >= i3) {
                            break;
                        }
                        if ((j2 & 255) < 128) {
                            jft jftVar = (jft) objArr[(i6 << 3) + i8];
                            if (icz.d(jftVar.b).g(j) && (jjkVar = (jjk) jjo.a(jftVar.a.c, jkuVar)) != null) {
                                boolean z3 = jjkVar.c;
                                if (z3) {
                                    c = '\b';
                                    i4 = -i;
                                } else {
                                    c = '\b';
                                    i4 = i;
                                }
                                if (!(i == 0 && z3) && i4 >= 0) {
                                    if (((Number) jjkVar.a.invoke()).floatValue() >= ((Number) jjkVar.b.invoke()).floatValue()) {
                                        j2 >>= c;
                                        i8++;
                                        i5 = i2;
                                    }
                                    z2 = true;
                                    j2 >>= c;
                                    i8++;
                                    i5 = i2;
                                } else {
                                    if (((Number) jjkVar.a.invoke()).floatValue() <= 0.0f) {
                                        j2 >>= c;
                                        i8++;
                                        i5 = i2;
                                    }
                                    z2 = true;
                                    j2 >>= c;
                                    i8++;
                                    i5 = i2;
                                }
                            }
                        }
                        c = '\b';
                        j2 >>= c;
                        i8++;
                        i5 = i2;
                    }
                    if (i3 != 8) {
                        return z2;
                    }
                } else {
                    i2 = i5;
                }
                if (i6 == length) {
                    return z2;
                }
                i6++;
                i5 = i2;
            }
        }
        return false;
    }

    public final boolean C(int i) {
        return this.i == i;
    }

    public final boolean D() {
        return this.d.isEnabled() && !this.g.isEmpty();
    }

    public final boolean E() {
        return this.d.isEnabled() && this.d.isTouchExplorationEnabled();
    }

    public final boolean I(jjw jjwVar, int i, int i2, boolean z) {
        String N;
        jku jkuVar = jjl.a;
        if (jjwVar.c.f(jjl.i) && jan.e(jjwVar)) {
            ffjn ffjnVar = (ffjn) ((jjb) jjwVar.c.b(jjl.i)).b;
            if (ffjnVar != null) {
                return ((Boolean) ffjnVar.a(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.r) && (N = N(jjwVar)) != null) {
            if (i < 0 || i != i2 || i2 > N.length()) {
                i = -1;
            }
            this.r = i;
            boolean z2 = N.length() > 0;
            O(p(m(jjwVar.e), z2 ? Integer.valueOf(this.r) : null, z2 ? Integer.valueOf(this.r) : null, z2 ? Integer.valueOf(N.length()) : null, N));
            y(jjwVar.e);
            return true;
        }
        return false;
    }

    public final void L(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !D()) {
            return;
        }
        AccessibilityEvent o = o(i, i2);
        if (num != null) {
            o.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            o.setContentDescription(kau.d(list, ",", null, 62));
        }
        O(o);
    }

    public final void O(AccessibilityEvent accessibilityEvent) {
        if (D()) {
            if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
                this.m = true;
            }
            try {
                ((Boolean) this.G.invoke(accessibilityEvent)).booleanValue();
            } finally {
                this.m = false;
            }
        }
    }

    @Override // defpackage.ktb
    public final kxx a(View view) {
        return this.I;
    }

    public final int k(jjw jjwVar) {
        jku jkuVar = jkm.a;
        return (jjwVar.c.f(jkm.a) || !jjwVar.c.f(jkm.D)) ? this.r : jpm.a(((jpm) jjwVar.c.b(jkm.D)).b);
    }

    public final int l(jjw jjwVar) {
        jku jkuVar = jkm.a;
        return (jjwVar.c.f(jkm.a) || !jjwVar.c.f(jkm.D)) ? this.r : jpm.e(((jpm) jjwVar.c.b(jkm.D)).b);
    }

    public final int m(int i) {
        if (i == this.b.l.a().e) {
            return -1;
        }
        return i;
    }

    public final Rect n(jft jftVar) {
        Rect rect = jftVar.b;
        float f = rect.left;
        float f2 = rect.top;
        long h = this.b.h((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        float f3 = rect.right;
        float f4 = rect.bottom;
        long h2 = this.b.h((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        return new Rect((int) Math.floor(Float.intBitsToFloat((int) (h >> 32))), (int) Math.floor(Float.intBitsToFloat((int) (h & 4294967295L))), (int) Math.ceil(Float.intBitsToFloat((int) (h2 >> 32))), (int) Math.ceil(Float.intBitsToFloat((int) (h2 & 4294967295L))));
    }

    public final AccessibilityEvent o(int i, int i2) {
        jft jftVar;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.b.getContext().getPackageName());
        obtain.setSource(this.b, i);
        if (D() && (jftVar = (jft) q().a(i)) != null) {
            jku jkuVar = jkm.a;
            obtain.setPassword(jftVar.a.c.f(jkm.H));
        }
        return obtain;
    }

    public final AccessibilityEvent p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent o = o(i, 8192);
        if (num != null) {
            o.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            o.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            o.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            o.getText().add(charSequence);
        }
        return o;
    }

    public final cmy q() {
        if (this.t) {
            this.t = false;
            this.L = jfu.b(this.b.l);
            if (D()) {
                cmy cmyVar = this.L;
                cnu cnuVar = this.w;
                cnu cnuVar2 = this.x;
                Resources resources = this.b.getContext().getResources();
                int i = jan.a;
                cnuVar.c();
                cnuVar2.c();
                jft jftVar = (jft) cmyVar.a(-1);
                jjw jjwVar = jftVar != null ? jftVar.a : null;
                jjwVar.getClass();
                List d = jan.d(jan.g(jjwVar), ffdx.b(jjwVar), cmyVar, resources);
                int e = ffdx.e(d);
                if (e > 0) {
                    int i2 = 1;
                    while (true) {
                        int i3 = ((jjw) d.get(i2 - 1)).e;
                        int i4 = ((jjw) d.get(i2)).e;
                        cnuVar.d(i3, i4);
                        cnuVar2.d(i4, i3);
                        if (i2 == e) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return this.L;
    }

    public final kxu r() {
        if (this.d.isEnabled()) {
            return null;
        }
        return kxu.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0187, code lost:
    
        if (defpackage.ffsw.c(r7, r0) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:13:0x0055, B:18:0x0068, B:20:0x0070, B:22:0x0079, B:24:0x0080, B:26:0x008e, B:28:0x009c, B:32:0x00b0, B:35:0x00b7, B:37:0x00bb, B:41:0x00c6, B:43:0x00ce, B:44:0x00a8, B:45:0x00db, B:49:0x0153, B:50:0x00e2, B:52:0x00f0, B:56:0x0106, B:58:0x010e, B:60:0x0130, B:61:0x0150, B:65:0x0157, B:67:0x015e, B:68:0x0167, B:76:0x0041), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0187 -> B:13:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jae.s(ffgu):java.lang.Object");
    }

    public final void t(int i, kxu kxuVar, String str, Bundle bundle) {
        jjw jjwVar;
        int i2;
        jae jaeVar = this;
        jft jftVar = (jft) jaeVar.q().a(i);
        if (jftVar == null || (jjwVar = jftVar.a) == null) {
            return;
        }
        String str2 = jaeVar.y;
        String N = N(jjwVar);
        if (ffkj.e(str, str2)) {
            int b = jaeVar.w.b(i);
            if (b != -1) {
                kxuVar.a().putInt(str, b);
                return;
            }
            return;
        }
        if (ffkj.e(str, jaeVar.z)) {
            int b2 = jaeVar.x.b(i);
            if (b2 != -1) {
                kxuVar.a().putInt(str, b2);
                return;
            }
            return;
        }
        jjn jjnVar = jjwVar.c;
        jku jkuVar = jjl.a;
        if (!jjnVar.f(jjl.a) || bundle == null || !ffkj.e(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            jjn jjnVar2 = jjwVar.c;
            jku jkuVar2 = jkm.a;
            if (!jjnVar2.f(jkm.x) || bundle == null || !ffkj.e(str, "androidx.compose.ui.semantics.testTag")) {
                if (ffkj.e(str, "androidx.compose.ui.semantics.id")) {
                    kxuVar.a().putInt(str, jjwVar.e);
                    return;
                }
                return;
            } else {
                String str3 = (String) jjo.a(jjwVar.c, jkm.x);
                if (str3 != null) {
                    kxuVar.a().putCharSequence(str, str3);
                    return;
                }
                return;
            }
        }
        int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i4 > 0 && i3 >= 0) {
            if (i3 < (N != null ? N.length() : Alert.DURATION_SHOW_INDEFINITELY)) {
                jpg d = jfu.d(jjwVar.c);
                if (d != null) {
                    ArrayList arrayList = new ArrayList();
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i3 + i5;
                        RectF rectF = null;
                        if (i6 >= d.a.a.a()) {
                            arrayList.add(null);
                            i2 = i3;
                        } else {
                            iam f = d.m(i6).f(jjwVar.a());
                            iam b3 = jjwVar.b();
                            iam d2 = f.i(b3) ? f.d(b3) : null;
                            if (d2 != null) {
                                AndroidComposeView androidComposeView = jaeVar.b;
                                long floatToRawIntBits = Float.floatToRawIntBits(d2.b);
                                long floatToRawIntBits2 = Float.floatToRawIntBits(d2.c);
                                AndroidComposeView androidComposeView2 = jaeVar.b;
                                float f2 = d2.d;
                                long h = androidComposeView.h((floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L));
                                long floatToRawIntBits3 = Float.floatToRawIntBits(f2);
                                int floatToRawIntBits4 = Float.floatToRawIntBits(d2.e);
                                i2 = i3;
                                long h2 = androidComposeView2.h((floatToRawIntBits3 << 32) | (floatToRawIntBits4 & 4294967295L));
                                rectF = new RectF(Float.intBitsToFloat((int) (h >> 32)), Float.intBitsToFloat((int) (h & 4294967295L)), Float.intBitsToFloat((int) (h2 >> 32)), Float.intBitsToFloat((int) (h2 & 4294967295L)));
                            } else {
                                i2 = i3;
                            }
                            arrayList.add(rectF);
                        }
                        i5++;
                        jaeVar = this;
                        i3 = i2;
                    }
                    kxuVar.a().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final void u(iui iuiVar) {
        if (this.J.add(iuiVar)) {
            this.K.b(ffcu.a);
        }
    }

    public final void v(jfr jfrVar) {
        if (jfrVar.A()) {
            AndroidComposeView androidComposeView = this.b;
            androidComposeView.v.d(jfrVar, this.N, new jaa(jfrVar, this));
        }
    }

    public final void w(jjw jjwVar, jfs jfsVar) {
        int[] iArr = cnb.a;
        cnx cnxVar = new cnx((byte[]) null);
        List i = jjwVar.i();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            jjw jjwVar2 = (jjw) i.get(i2);
            if (q().b(jjwVar2.e)) {
                if (!jfsVar.b.a(jjwVar2.e)) {
                    u(jjwVar.b);
                    return;
                }
                cnxVar.e(jjwVar2.e);
            }
        }
        cnx cnxVar2 = jfsVar.b;
        int[] iArr2 = cnxVar2.b;
        long[] jArr = cnxVar2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 != 8) {
                                break;
                            }
                        } else if ((255 & j) < 128 && !cnxVar.a(iArr2[(i3 << 3) + i5])) {
                            u(jjwVar.b);
                            return;
                        } else {
                            j >>= 8;
                            i5++;
                        }
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List i7 = jjwVar.i();
        int size2 = i7.size();
        for (int i8 = 0; i8 < size2; i8++) {
            jjw jjwVar3 = (jjw) i7.get(i8);
            if (q().b(jjwVar3.e)) {
                Object a2 = this.A.a(jjwVar3.e);
                a2.getClass();
                w(jjwVar3, (jfs) a2);
            }
        }
    }

    public final void x(int i, int i2, String str) {
        AccessibilityEvent o = o(m(i), 32);
        o.setContentChangeTypes(i2);
        if (str != null) {
            o.getText().add(str);
        }
        O(o);
    }

    public final void y(int i) {
        izx izxVar = this.u;
        if (izxVar != null) {
            if (i != izxVar.a.e) {
                return;
            }
            if (SystemClock.uptimeMillis() - izxVar.f <= 1000) {
                AccessibilityEvent o = o(m(izxVar.a.e), 131072);
                o.setFromIndex(izxVar.d);
                o.setToIndex(izxVar.e);
                o.setAction(izxVar.b);
                o.setMovementGranularity(izxVar.c);
                o.getText().add(N(izxVar.a));
                O(o);
            }
        }
        this.u = null;
    }

    public final void z(jjw jjwVar, kxu kxuVar) {
        SpannableString spannableString;
        List list;
        int i;
        List list2;
        int i2;
        jlm b = jan.b(jjwVar);
        if (b != null) {
            AndroidComposeView androidComposeView = this.b;
            jxn jxnVar = this.M;
            jse l = androidComposeView.l();
            jzn m = androidComposeView.m();
            SpannableString spannableString2 = new SpannableString(b.b);
            List list3 = b.c;
            if (list3 != null) {
                int size = list3.size();
                int i3 = 0;
                while (i3 < size) {
                    jlk jlkVar = (jlk) list3.get(i3);
                    jou jouVar = (jou) jlkVar.a;
                    int i4 = jlkVar.b;
                    int i5 = jlkVar.c;
                    int i6 = size;
                    long b2 = jouVar.b();
                    long j = jouVar.b;
                    jsy jsyVar = jouVar.c;
                    jss jssVar = jouVar.d;
                    jst jstVar = jouVar.e;
                    String str = jouVar.g;
                    long j2 = jouVar.h;
                    jxv jxvVar = jouVar.i;
                    jys jysVar = jouVar.j;
                    jws jwsVar = jouVar.k;
                    long j3 = jouVar.l;
                    jyk jykVar = jouVar.m;
                    idg idgVar = jouVar.n;
                    jmp jmpVar = jouVar.o;
                    ifs ifsVar = jouVar.p;
                    long b3 = jouVar.b();
                    long j4 = ibw.a;
                    int i7 = i3;
                    jou jouVar2 = new jou(ffcp.a(b2, b3) ? jouVar.a : jyn.a(b2), j, jsyVar, jssVar, jstVar, null, str, j2, jxvVar, jysVar, jwsVar, j3, jykVar, idgVar, jmpVar, ifsVar);
                    jxq.d(spannableString2, jouVar2.b(), i4, i5);
                    jxq.e(spannableString2, jouVar2.b, m, i4, i5);
                    jsy jsyVar2 = jouVar2.c;
                    if (jsyVar2 == null && jouVar2.d == null) {
                        i2 = 33;
                    } else {
                        if (jsyVar2 == null) {
                            jsyVar2 = jsy.e;
                        }
                        jss jssVar2 = jouVar2.d;
                        StyleSpan styleSpan = new StyleSpan(jrq.b(jsyVar2, jssVar2 != null ? jssVar2.a : 0));
                        i2 = 33;
                        spannableString2.setSpan(styleSpan, i4, i5, 33);
                    }
                    jsf jsfVar = jouVar2.f;
                    if (jsfVar != null) {
                        if (jsfVar instanceof jta) {
                            spannableString2.setSpan(new TypefaceSpan(((jta) jsfVar).d), i4, i5, i2);
                        } else if (Build.VERSION.SDK_INT >= 28) {
                            jsf jsfVar2 = jouVar2.f;
                            jst jstVar2 = jouVar2.e;
                            Object a2 = l.a(jsfVar2, jsy.e, 0, jstVar2 != null ? jstVar2.a : 65535).a();
                            a2.getClass();
                            TypefaceSpan typefaceSpan = new TypefaceSpan((Typeface) a2);
                            i2 = 33;
                            spannableString2.setSpan(typefaceSpan, i4, i5, 33);
                        } else {
                            i2 = 33;
                        }
                    }
                    jyk jykVar2 = jouVar2.m;
                    if (jykVar2 != null) {
                        if (jykVar2.a(jyk.b)) {
                            spannableString2.setSpan(new UnderlineSpan(), i4, i5, i2);
                        }
                        if (jouVar2.m.a(jyk.c)) {
                            spannableString2.setSpan(new StrikethroughSpan(), i4, i5, i2);
                        }
                    }
                    jys jysVar2 = jouVar2.j;
                    if (jysVar2 != null) {
                        spannableString2.setSpan(new ScaleXSpan(jysVar2.b), i4, i5, i2);
                    }
                    jxq.f(spannableString2, jouVar2.k, i4, i5);
                    jxq.c(spannableString2, jouVar2.l, i4, i5);
                    i3 = i7 + 1;
                    size = i6;
                }
            }
            int a3 = b.a();
            List list4 = b.a;
            if (list4 != null) {
                list = new ArrayList(list4.size());
                int size2 = list4.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    Object obj = list4.get(i8);
                    jlk jlkVar2 = (jlk) obj;
                    if ((jlkVar2.a instanceof jpq) && jlp.b(0, a3, jlkVar2.b, jlkVar2.c)) {
                        list.add(obj);
                    }
                }
            } else {
                list = ffel.a;
            }
            int size3 = list.size();
            for (int i9 = 0; i9 < size3; i9++) {
                jlk jlkVar3 = (jlk) list.get(i9);
                jpq jpqVar = (jpq) jlkVar3.a;
                int i10 = jlkVar3.b;
                int i11 = jlkVar3.c;
                if (!(jpqVar instanceof jps)) {
                    throw new ffcd();
                }
                spannableString2.setSpan(new TtsSpan.VerbatimBuilder(((jps) jpqVar).a).build(), i10, i11, 33);
            }
            int a4 = b.a();
            List list5 = b.a;
            if (list5 != null) {
                list2 = new ArrayList(list5.size());
                int size4 = list5.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    Object obj2 = list5.get(i12);
                    jlk jlkVar4 = (jlk) obj2;
                    if ((jlkVar4.a instanceof jpr) && jlp.b(0, a4, jlkVar4.b, jlkVar4.c)) {
                        list2.add(obj2);
                    }
                }
                i = 0;
            } else {
                i = 0;
                list2 = ffel.a;
            }
            int size5 = list2.size();
            for (int i13 = i; i13 < size5; i13++) {
                jlk jlkVar5 = (jlk) list2.get(i13);
                jpr jprVar = (jpr) jlkVar5.a;
                int i14 = jlkVar5.b;
                int i15 = jlkVar5.c;
                WeakHashMap weakHashMap = jxnVar.a;
                Object obj3 = weakHashMap.get(jprVar);
                if (obj3 == null) {
                    URLSpan uRLSpan = new URLSpan(jprVar.a);
                    weakHashMap.put(jprVar, uRLSpan);
                    obj3 = uRLSpan;
                }
                spannableString2.setSpan((URLSpan) obj3, i14, i15, 33);
            }
            List f = b.f(b.a());
            int size6 = f.size();
            for (int i16 = i; i16 < size6; i16++) {
                jlk jlkVar6 = (jlk) f.get(i16);
                if (jlkVar6.b != jlkVar6.c) {
                    jlw jlwVar = (jlw) jlkVar6.a;
                    if (jlwVar instanceof jlv) {
                        jlwVar.b();
                        Object obj4 = jlkVar6.a;
                        obj4.getClass();
                        jlk jlkVar7 = new jlk((jlv) obj4, jlkVar6.b, jlkVar6.c);
                        WeakHashMap weakHashMap2 = jxnVar.b;
                        Object obj5 = weakHashMap2.get(jlkVar7);
                        if (obj5 == null) {
                            URLSpan uRLSpan2 = new URLSpan(((jlv) jlkVar7.a).a);
                            weakHashMap2.put(jlkVar7, uRLSpan2);
                            obj5 = uRLSpan2;
                        }
                        spannableString2.setSpan((URLSpan) obj5, jlkVar6.b, jlkVar6.c, 33);
                    } else {
                        WeakHashMap weakHashMap3 = jxnVar.c;
                        Object obj6 = weakHashMap3.get(jlkVar6);
                        if (obj6 == null) {
                            jxd jxdVar = new jxd((jlw) jlkVar6.a);
                            weakHashMap3.put(jlkVar6, jxdVar);
                            obj6 = jxdVar;
                        }
                        spannableString2.setSpan((ClickableSpan) obj6, jlkVar6.b, jlkVar6.c, 33);
                    }
                }
            }
            spannableString = (SpannableString) M(spannableString2);
        } else {
            spannableString = null;
        }
        kxuVar.R(spannableString);
    }
}
