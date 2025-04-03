package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import androidx.car.app.model.Alert;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxd extends mxi implements mii {
    public static final enom a = enom.d(new Comparator() { // from class: mwe
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            enom enomVar = mxd.a;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    public final Object b;
    public final Context c;
    public mws d;
    public mww e;
    public lpk f;

    public mxd(Context context) {
        mws mwsVar = mws.F;
        this.b = new Object();
        this.c = context != null ? context.getApplicationContext() : null;
        if (mwsVar instanceof mws) {
            this.d = mwsVar;
        } else {
            mwr mwrVar = new mwr(mws.F);
            mwrVar.e(mwsVar);
            this.d = new mws(mwrVar);
        }
        this.f = lpk.a;
        if (this.d.Q && context == null) {
            luj.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    protected static int a(lqc lqcVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(lqcVar.d)) {
            return 4;
        }
        String f = f(str);
        String f2 = f(lqcVar.d);
        if (f2 == null || f == null) {
            return (z && f2 == null) ? 1 : 0;
        }
        if (f2.startsWith(f) || f.startsWith(f2)) {
            return 3;
        }
        return lvf.ah(f2, "-")[0].equals(lvf.ah(f, "-")[0]) ? 2 : 0;
    }

    public static int b(int i, int i2) {
        return (i == 0 || i != i2) ? Integer.bitCount(i & i2) : Alert.DURATION_SHOW_INDEFINITELY;
    }

    protected static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static void p(mvo mvoVar, lrz lrzVar, Map map) {
        lrw lrwVar;
        for (int i = 0; i < mvoVar.b; i++) {
            lrw lrwVar2 = (lrw) lrzVar.D.get(mvoVar.b(i));
            if (lrwVar2 != null && ((lrwVar = (lrw) map.get(Integer.valueOf(lrwVar2.a()))) == null || (lrwVar.b.isEmpty() && !lrwVar2.b.isEmpty()))) {
                map.put(Integer.valueOf(lrwVar2.a()), lrwVar2);
            }
        }
    }

    private final void q(mws mwsVar) {
        boolean equals;
        synchronized (this.b) {
            equals = this.d.equals(mwsVar);
            this.d = mwsVar;
        }
        if (equals) {
            return;
        }
        if (mwsVar.Q && this.c == null) {
            luj.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        o();
    }

    private static final Pair r(int i, mxh mxhVar, int[][][] iArr, mwy mwyVar, Comparator comparator) {
        RandomAccess randomAccess;
        mxh mxhVar2 = mxhVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < mxhVar2.a) {
            if (i == mxhVar2.a(i2)) {
                mvo c = mxhVar2.c(i2);
                for (int i3 = 0; i3 < c.b; i3++) {
                    lrv b = c.b(i3);
                    List a2 = mwyVar.a(i2, b, iArr[i2][i3]);
                    boolean[] zArr = new boolean[b.a];
                    int i4 = 0;
                    while (i4 < b.a) {
                        int i5 = i4 + 1;
                        mwz mwzVar = (mwz) a2.get(i4);
                        int b2 = mwzVar.b();
                        if (!zArr[i4] && b2 != 0) {
                            if (b2 == 1) {
                                randomAccess = engw.r(mwzVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(mwzVar);
                                for (int i6 = i5; i6 < b.a; i6++) {
                                    mwz mwzVar2 = (mwz) a2.get(i6);
                                    if (mwzVar2.b() == 2 && mwzVar.c(mwzVar2)) {
                                        arrayList2.add(mwzVar2);
                                        zArr[i6] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i4 = i5;
                    }
                }
            }
            i2++;
            mxhVar2 = mxhVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((mwz) list.get(i7)).c;
        }
        mwz mwzVar3 = (mwz) list.get(0);
        return Pair.create(new mxe(mwzVar3.b, iArr2), Integer.valueOf(mwzVar3.a));
    }

    @Override // defpackage.mxl
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final mws c() {
        mws mwsVar;
        synchronized (this.b) {
            mwsVar = this.d;
        }
        return mwsVar;
    }

    public final void g() {
        boolean z;
        mww mwwVar;
        synchronized (this.b) {
            z = false;
            if (this.d.Q && lvf.a >= 32 && (mwwVar = this.e) != null && mwwVar.b) {
                z = true;
            }
        }
        if (z) {
            o();
        }
    }

    @Override // defpackage.mxl
    public final void h() {
        mww mwwVar;
        Spatializer spatializer;
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        if (lvf.a >= 32 && (mwwVar = this.e) != null && (spatializer = mwwVar.a) != null && (spatializer$OnSpatializerStateChangedListener = mwwVar.d) != null && mwwVar.c != null) {
            spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            mwwVar.c.removeCallbacksAndMessages(null);
        }
        this.g = null;
        this.h = null;
    }

    @Override // defpackage.mxl
    public final void i(lpk lpkVar) {
        if (this.f.equals(lpkVar)) {
            return;
        }
        this.f = lpkVar;
        g();
    }

    @Override // defpackage.mxl
    public final void j(lrz lrzVar) {
        q((mws) lrzVar);
        mwr mwrVar = new mwr(c());
        mwrVar.e(lrzVar);
        q(new mws(mwrVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [mwq] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r11v14, types: [mwq] */
    /* JADX WARN: Type inference failed for: r13v5, types: [mxe] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r6v0, types: [mxe[]] */
    /* JADX WARN: Type inference failed for: r9v19, types: [mxe] */
    @Override // defpackage.mxi
    protected final Pair k(mxh mxhVar, int[][][] iArr, final int[] iArr2) {
        final mws mwsVar;
        int i;
        int i2;
        final boolean z;
        int i3;
        ?? r17;
        final Point point;
        Pair pair;
        final String str;
        long j;
        int[] iArr3;
        int length;
        long j2;
        mxe[] mxeVarArr;
        int[] iArr4;
        Object obj;
        int i4;
        int i5;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        boolean z2;
        boolean z3;
        boolean z4;
        int[][][] iArr5 = iArr;
        synchronized (this.b) {
            mwsVar = this.d;
        }
        if (mwsVar.Q && lvf.a >= 32 && this.e == null) {
            this.e = new mww(this.c, this);
        }
        int i6 = mxhVar.a;
        ?? r6 = new mxe[i6];
        int i7 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i7 >= mxhVar.a) {
                z = false;
                break;
            }
            if (mxhVar.a(i7) == 2 && mxhVar.c(i7).b > 0) {
                z = true;
                break;
            }
            i7++;
        }
        Pair r = r(1, mxhVar, iArr5, new mwy() { // from class: mwj
            @Override // defpackage.mwy
            public final List a(int i8, lrv lrvVar, int[] iArr6) {
                final mxd mxdVar = mxd.this;
                final mws mwsVar2 = mwsVar;
                emxg emxgVar = new emxg() { // from class: mwl
                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    @Override // defpackage.emxg
                    public final boolean a(Object obj2) {
                        int i9;
                        mww mwwVar;
                        boolean isAvailable;
                        boolean isEnabled;
                        int i10;
                        boolean canBeSpatialized;
                        char c;
                        mww mwwVar2;
                        lqc lqcVar = (lqc) obj2;
                        if (mwsVar2.Q && (i9 = lqcVar.E) != -1 && i9 > 2) {
                            mxd mxdVar2 = mxd.this;
                            String str2 = lqcVar.o;
                            if (str2 != null) {
                                switch (str2.hashCode()) {
                                    case -2123537834:
                                        if (str2.equals("audio/eac3-joc")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 187078296:
                                        if (str2.equals("audio/ac3")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 187078297:
                                        if (str2.equals("audio/ac4")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1504578661:
                                        if (str2.equals("audio/eac3")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                if ((c == 0 || c == 1 || c == 2 || c == 3) && (lvf.a < 32 || (mwwVar2 = mxdVar2.e) == null || !mwwVar2.b)) {
                                    return true;
                                }
                            }
                            if (lvf.a >= 32 && (mwwVar = mxdVar2.e) != null && mwwVar.b) {
                                Spatializer spatializer = mwwVar.a;
                                lti.f(spatializer);
                                isAvailable = spatializer.isAvailable();
                                if (isAvailable) {
                                    Spatializer spatializer2 = mxdVar2.e.a;
                                    lti.f(spatializer2);
                                    isEnabled = spatializer2.isEnabled();
                                    if (isEnabled) {
                                        mww mwwVar3 = mxdVar2.e;
                                        lpk lpkVar = mxdVar2.f;
                                        if (Objects.equals(lqcVar.o, "audio/eac3-joc")) {
                                            i10 = lqcVar.E;
                                            if (i10 == 16) {
                                                i10 = 12;
                                            }
                                        } else if (Objects.equals(lqcVar.o, "audio/iamf")) {
                                            i10 = lqcVar.E;
                                            if (i10 == -1) {
                                                i10 = 6;
                                            }
                                        } else if (Objects.equals(lqcVar.o, "audio/ac4")) {
                                            i10 = lqcVar.E;
                                            if (i10 == 18 || i10 == 21) {
                                                i10 = 24;
                                            }
                                        } else {
                                            i10 = lqcVar.E;
                                        }
                                        int h = lvf.h(i10);
                                        if (h != 0) {
                                            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(h);
                                            int i11 = lqcVar.F;
                                            if (i11 != -1) {
                                                channelMask.setSampleRate(i11);
                                            }
                                            Spatializer spatializer3 = mwwVar3.a;
                                            lti.f(spatializer3);
                                            canBeSpatialized = spatializer3.canBeSpatialized(lpkVar.a().a, channelMask.build());
                                            if (canBeSpatialized) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                            return false;
                        }
                        return true;
                    }
                };
                int i9 = iArr2[i8];
                int i10 = engw.d;
                engr engrVar = new engr();
                for (int i11 = 0; i11 < lrvVar.a; i11++) {
                    engrVar.h(new mwo(i8, lrvVar, i11, mwsVar2, iArr6[i11], z, emxgVar));
                }
                return engrVar.g();
            }
        }, new Comparator() { // from class: mwk
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((mwo) Collections.max((List) obj2)).a((mwo) Collections.max((List) obj3));
            }
        });
        if (r != null) {
            r6[((Integer) r.second).intValue()] = (mxe) r.first;
        }
        final String str2 = r == null ? null : ((mxe) r.first).a.a(((mxe) r.first).b[0]).d;
        int i8 = mwsVar.u.b;
        if (!mwsVar.k || (context2 = this.c) == null) {
            i3 = 0;
            r17 = 0;
            point = null;
        } else {
            int i9 = lvf.a;
            DisplayManager displayManager = (DisplayManager) context2.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null) {
                WindowManager windowManager = (WindowManager) context2.getSystemService("window");
                lti.f(windowManager);
                display = windowManager.getDefaultDisplay();
            }
            if (display.getDisplayId() == 0 && lvf.ab(context2)) {
                String K = lvf.a < 28 ? lvf.K("sys.display-size") : lvf.K("vendor.display-size");
                if (TextUtils.isEmpty(K)) {
                    i3 = 0;
                    z4 = false;
                } else {
                    try {
                        i3 = 0;
                        try {
                            String[] ag = lvf.ag(K.trim(), "x");
                            if (ag.length == 2) {
                                int parseInt = Integer.parseInt(ag[0]);
                                int parseInt2 = Integer.parseInt(ag[1]);
                                if (parseInt > 0 && parseInt2 > 0) {
                                    z3 = false;
                                    r17 = 0;
                                    try {
                                        point = new Point(parseInt, parseInt2);
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                            }
                        } catch (NumberFormatException unused2) {
                        }
                    } catch (NumberFormatException unused3) {
                        i3 = 0;
                    }
                    z3 = false;
                    luj.c("Util", "Invalid display size: ".concat(String.valueOf(K)));
                    z4 = z3;
                }
                z2 = z4;
                if ("Sony".equals(Build.MANUFACTURER)) {
                    z2 = z4;
                    if (Build.MODEL.startsWith("BRAVIA")) {
                        z2 = z4;
                        if (context2.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                            point = new Point(3840, 2160);
                            r17 = z4;
                        }
                    }
                }
            } else {
                i3 = 0;
                z2 = false;
            }
            point = new Point();
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            r17 = z2;
        }
        Pair r2 = r(2, mxhVar, iArr5, new mwy() { // from class: mwh
            /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
            @Override // defpackage.mwy
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List a(int r17, defpackage.lrv r18, int[] r19) {
                /*
                    Method dump skipped, instructions count: 190
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mwh.a(int, lrv, int[]):java.util.List");
            }
        }, new Comparator() { // from class: mwi
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                List list = (List) obj2;
                List list2 = (List) obj3;
                return enem.b.d((mxc) Collections.max(list, new Comparator() { // from class: mxa
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        mxc mxcVar = (mxc) obj4;
                        mxc mxcVar2 = (mxc) obj5;
                        enem e = enem.b.e(mxcVar.h, mxcVar2.h).d(Integer.valueOf(mxcVar.m), Integer.valueOf(mxcVar2.m), enpf.a).b(mxcVar.n, mxcVar2.n).b(mxcVar.o, mxcVar2.o).e(mxcVar.p, mxcVar2.p).b(mxcVar.q, mxcVar2.q).e(mxcVar.i, mxcVar2.i).e(mxcVar.e, mxcVar2.e).e(mxcVar.g, mxcVar2.g).d(Integer.valueOf(mxcVar.l), Integer.valueOf(mxcVar2.l), enpf.a).e(mxcVar.r, mxcVar2.r).e(mxcVar.s, mxcVar2.s);
                        if (mxcVar.r && mxcVar.s) {
                            e = e.b(mxcVar.t, mxcVar2.t);
                        }
                        return e.a();
                    }
                }), (mxc) Collections.max(list2, new Comparator() { // from class: mxa
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        mxc mxcVar = (mxc) obj4;
                        mxc mxcVar2 = (mxc) obj5;
                        enem e = enem.b.e(mxcVar.h, mxcVar2.h).d(Integer.valueOf(mxcVar.m), Integer.valueOf(mxcVar2.m), enpf.a).b(mxcVar.n, mxcVar2.n).b(mxcVar.o, mxcVar2.o).e(mxcVar.p, mxcVar2.p).b(mxcVar.q, mxcVar2.q).e(mxcVar.i, mxcVar2.i).e(mxcVar.e, mxcVar2.e).e(mxcVar.g, mxcVar2.g).d(Integer.valueOf(mxcVar.l), Integer.valueOf(mxcVar2.l), enpf.a).e(mxcVar.r, mxcVar2.r).e(mxcVar.s, mxcVar2.s);
                        if (mxcVar.r && mxcVar.s) {
                            e = e.b(mxcVar.t, mxcVar2.t);
                        }
                        return e.a();
                    }
                }), new Comparator() { // from class: mxa
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        mxc mxcVar = (mxc) obj4;
                        mxc mxcVar2 = (mxc) obj5;
                        enem e = enem.b.e(mxcVar.h, mxcVar2.h).d(Integer.valueOf(mxcVar.m), Integer.valueOf(mxcVar2.m), enpf.a).b(mxcVar.n, mxcVar2.n).b(mxcVar.o, mxcVar2.o).e(mxcVar.p, mxcVar2.p).b(mxcVar.q, mxcVar2.q).e(mxcVar.i, mxcVar2.i).e(mxcVar.e, mxcVar2.e).e(mxcVar.g, mxcVar2.g).d(Integer.valueOf(mxcVar.l), Integer.valueOf(mxcVar2.l), enpf.a).e(mxcVar.r, mxcVar2.r).e(mxcVar.s, mxcVar2.s);
                        if (mxcVar.r && mxcVar.s) {
                            e = e.b(mxcVar.t, mxcVar2.t);
                        }
                        return e.a();
                    }
                }).b(list.size(), list2.size()).d((mxc) Collections.max(list, new Comparator() { // from class: mxb
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        mxc mxcVar = (mxc) obj4;
                        mxc mxcVar2 = (mxc) obj5;
                        enom c = (mxcVar.e && mxcVar.h) ? mxd.a : mxd.a.c();
                        enem enemVar = enem.b;
                        boolean z5 = mxcVar.f.B;
                        return enemVar.d(Integer.valueOf(mxcVar.k), Integer.valueOf(mxcVar2.k), c).d(Integer.valueOf(mxcVar.j), Integer.valueOf(mxcVar2.j), c).a();
                    }
                }), (mxc) Collections.max(list2, new Comparator() { // from class: mxb
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        mxc mxcVar = (mxc) obj4;
                        mxc mxcVar2 = (mxc) obj5;
                        enom c = (mxcVar.e && mxcVar.h) ? mxd.a : mxd.a.c();
                        enem enemVar = enem.b;
                        boolean z5 = mxcVar.f.B;
                        return enemVar.d(Integer.valueOf(mxcVar.k), Integer.valueOf(mxcVar2.k), c).d(Integer.valueOf(mxcVar.j), Integer.valueOf(mxcVar2.j), c).a();
                    }
                }), new Comparator() { // from class: mxb
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        mxc mxcVar = (mxc) obj4;
                        mxc mxcVar2 = (mxc) obj5;
                        enom c = (mxcVar.e && mxcVar.h) ? mxd.a : mxd.a.c();
                        enem enemVar = enem.b;
                        boolean z5 = mxcVar.f.B;
                        return enemVar.d(Integer.valueOf(mxcVar.k), Integer.valueOf(mxcVar2.k), c).d(Integer.valueOf(mxcVar.j), Integer.valueOf(mxcVar2.j), c).a();
                    }
                }).a();
            }
        });
        boolean z5 = mwsVar.A;
        int i10 = 4;
        if (r2 == null) {
            int i11 = mwsVar.u.b;
            pair = r(4, mxhVar, iArr5, new mwy() { // from class: mwf
                @Override // defpackage.mwy
                public final List a(int i12, lrv lrvVar, int[] iArr6) {
                    enom enomVar = mxd.a;
                    int i13 = engw.d;
                    engr engrVar = new engr();
                    for (int i14 = 0; i14 < lrvVar.a; i14++) {
                        engrVar.h(new mwp(i12, lrvVar, i14, mws.this, iArr6[i14]));
                    }
                    return engrVar.g();
                }
            }, new Comparator() { // from class: mwg
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return ((mwp) ((List) obj2).get(0)).compareTo((mwp) ((List) obj3).get(0));
                }
            });
        } else {
            pair = r17;
        }
        if (pair != null) {
            r6[((Integer) pair.second).intValue()] = (mxe) pair.first;
        } else if (r2 != null) {
            r6[((Integer) r2.second).intValue()] = (mxe) r2.first;
        }
        int i12 = mwsVar.u.b;
        if (!mwsVar.x || (context = this.c) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            str = r17;
        } else {
            int i13 = lvf.a;
            str = locale.toLanguageTag();
        }
        int i14 = 3;
        Pair r3 = r(3, mxhVar, iArr5, new mwy() { // from class: mwm
            @Override // defpackage.mwy
            public final List a(int i15, lrv lrvVar, int[] iArr6) {
                enom enomVar = mxd.a;
                int i16 = engw.d;
                engr engrVar = new engr();
                for (int i17 = 0; i17 < lrvVar.a; i17++) {
                    engrVar.h(new mwx(i15, lrvVar, i17, mws.this, iArr6[i17], str2, str));
                }
                return engrVar.g();
            }
        }, new Comparator() { // from class: mwn
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((mwx) ((List) obj2).get(0)).a((mwx) ((List) obj3).get(0));
            }
        });
        if (r3 != null) {
            r6[((Integer) r3.second).intValue()] = (mxe) r3.first;
        }
        int i15 = i3;
        while (i15 < i6) {
            int a2 = mxhVar.a(i15);
            if (a2 == i || a2 == i2 || a2 == i14 || a2 == i10) {
                i4 = i15;
            } else {
                mvo c = mxhVar.c(i15);
                int[][] iArr6 = iArr5[i15];
                int i16 = mwsVar.u.b;
                int i17 = i3;
                int i18 = i17;
                lrv lrvVar = r17;
                lrv lrvVar2 = lrvVar;
                while (i17 < c.b) {
                    lrv b = c.b(i17);
                    int[] iArr7 = iArr6[i17];
                    int i19 = i3;
                    ?? r10 = lrvVar2;
                    while (i19 < b.a) {
                        if (mih.g(iArr7[i19], mwsVar.R)) {
                            i5 = i15;
                            ?? mwqVar = new mwq(b.a(i19), iArr7[i19]);
                            if (r10 == 0 || mwqVar.compareTo(r10) > 0) {
                                lrvVar = b;
                                i18 = i19;
                                r10 = mwqVar;
                            }
                        } else {
                            i5 = i15;
                        }
                        i19++;
                        i15 = i5;
                        r10 = r10;
                    }
                    i17++;
                    lrvVar2 = r10;
                }
                i4 = i15;
                r6[i4] = lrvVar == null ? r17 : new mxe(lrvVar, i18);
            }
            i15 = i4 + 1;
            iArr5 = iArr;
            i10 = 4;
            i14 = 3;
            i = 2;
            i2 = 1;
        }
        int i20 = mxhVar.a;
        HashMap hashMap = new HashMap();
        for (int i21 = i3; i21 < i20; i21++) {
            p(mxhVar.c(i21), mwsVar, hashMap);
        }
        p(mxhVar.e, mwsVar, hashMap);
        for (int i22 = i3; i22 < i20; i22++) {
            lrw lrwVar = (lrw) hashMap.get(Integer.valueOf(mxhVar.a(i22)));
            if (lrwVar != null) {
                r6[i22] = (lrwVar.b.isEmpty() || mxhVar.c(i22).a(lrwVar.a) == -1) ? r17 : new mxe(lrwVar.a, ermn.l(lrwVar.b));
            }
        }
        int i23 = mxhVar.a;
        for (int i24 = i3; i24 < i23; i24++) {
            mvo c2 = mxhVar.c(i24);
            Map map = (Map) mwsVar.V.get(i24);
            if (map != null && map.containsKey(c2)) {
                Map map2 = (Map) mwsVar.V.get(i24);
                if ((map2 != null ? (mwt) map2.get(c2) : r17) != null) {
                    throw r17;
                }
                r6[i24] = r17;
            }
        }
        for (int i25 = i3; i25 < i6; i25++) {
            int a3 = mxhVar.a(i25);
            if (mwsVar.a(i25) || mwsVar.E.contains(Integer.valueOf(a3))) {
                r6[i25] = r17;
            }
        }
        lti.g(this.h);
        ArrayList arrayList = new ArrayList();
        int i26 = i3;
        Object obj2 = r17;
        while (i26 < i6) {
            ?? r9 = r6[i26];
            if (r9 == 0 || r9.b.length <= 1) {
                obj = obj2;
                arrayList.add(obj);
            } else {
                int i27 = engw.d;
                engr engrVar = new engr();
                engrVar.h(new mwa(0L, 0L));
                arrayList.add(engrVar);
                obj = obj2;
            }
            i26++;
            obj2 = obj;
        }
        long[][] jArr = new long[i6][];
        int i28 = i3;
        while (true) {
            j = -1;
            if (i28 >= i6) {
                break;
            }
            ?? r13 = r6[i28];
            if (r13 == 0) {
                jArr[i28] = new long[i3];
            } else {
                jArr[i28] = new long[r13.b.length];
                int i29 = 0;
                while (true) {
                    int[] iArr8 = r13.b;
                    if (i29 >= iArr8.length) {
                        break;
                    }
                    long j3 = r13.a.a(iArr8[i29]).j;
                    long[] jArr2 = jArr[i28];
                    if (j3 == -1) {
                        j3 = 0;
                    }
                    jArr2[i29] = j3;
                    i29++;
                }
                Arrays.sort(jArr[i28]);
            }
            i28++;
            i3 = 0;
        }
        int[] iArr9 = new int[i6];
        long[] jArr3 = new long[i6];
        for (int i30 = 0; i30 < i6; i30++) {
            long[] jArr4 = jArr[i30];
            jArr3[i30] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        mwb.h(arrayList, jArr3);
        enkg a4 = new ennf(enoe.a).b().a();
        int i31 = 0;
        mxe[] mxeVarArr2 = r6;
        while (i31 < i6) {
            int length2 = jArr[i31].length;
            if (length2 <= 1) {
                iArr4 = iArr9;
                j2 = j;
                mxeVarArr = mxeVarArr2;
            } else {
                double[] dArr = new double[length2];
                j2 = j;
                int i32 = 0;
                mxe[] mxeVarArr3 = mxeVarArr2;
                while (true) {
                    long[] jArr5 = jArr[i31];
                    int length3 = jArr5.length;
                    double d = eobe.a;
                    if (i32 >= length3) {
                        break;
                    }
                    mxe[] mxeVarArr4 = mxeVarArr3;
                    int[] iArr10 = iArr9;
                    long j4 = jArr5[i32];
                    if (j4 != j2) {
                        d = Math.log(j4);
                    }
                    dArr[i32] = d;
                    i32++;
                    mxeVarArr3 = mxeVarArr4;
                    iArr9 = iArr10;
                }
                mxeVarArr = mxeVarArr3;
                iArr4 = iArr9;
                int i33 = length2 - 1;
                double d2 = dArr[i33] - dArr[0];
                int i34 = 0;
                while (i34 < i33) {
                    double d3 = dArr[i34];
                    i34++;
                    a4.t(Double.valueOf(d2 == eobe.a ? 1.0d : (((d3 + dArr[i34]) * 0.5d) - dArr[0]) / d2), Integer.valueOf(i31));
                }
            }
            i31++;
            mxeVarArr2 = mxeVarArr;
            iArr9 = iArr4;
            j = j2;
        }
        mxe[] mxeVarArr5 = mxeVarArr2;
        int[] iArr11 = iArr9;
        engw n = engw.n(a4.v());
        for (int i35 = 0; i35 < n.size(); i35++) {
            int intValue = ((Integer) n.get(i35)).intValue();
            int i36 = iArr11[intValue] + 1;
            iArr11[intValue] = i36;
            jArr3[intValue] = jArr[intValue][i36];
            mwb.h(arrayList, jArr3);
        }
        for (int i37 = 0; i37 < i6; i37++) {
            if (arrayList.get(i37) != null) {
                long j5 = jArr3[i37];
                jArr3[i37] = j5 + j5;
            }
        }
        mwb.h(arrayList, jArr3);
        engr engrVar2 = new engr();
        for (int i38 = 0; i38 < arrayList.size(); i38++) {
            engr engrVar3 = (engr) arrayList.get(i38);
            engrVar2.h(engrVar3 == null ? enou.a : engrVar3.g());
        }
        engw g = engrVar2.g();
        mxf[] mxfVarArr = new mxf[i6];
        for (int i39 = 0; i39 < i6; i39++) {
            mxe mxeVar = mxeVarArr5[i39];
            if (mxeVar != null && (length = (iArr3 = mxeVar.b).length) != 0) {
                mxfVarArr[i39] = length == 1 ? new mxg(mxeVar.a, iArr3[0]) : new mwb(mxeVar.a, iArr3, (engw) g.get(i39));
            }
        }
        mik[] mikVarArr = new mik[i6];
        for (int i40 = 0; i40 < i6; i40++) {
            mikVarArr[i40] = (mwsVar.a(i40) || mwsVar.E.contains(Integer.valueOf(mxhVar.a(i40))) || (mxhVar.a(i40) != -2 && mxfVarArr[i40] == null)) ? null : mik.a;
        }
        boolean z6 = mwsVar.S;
        int i41 = mwsVar.u.b;
        return Pair.create(mikVarArr, mxfVarArr);
    }

    @Override // defpackage.mxl
    public final mii d() {
        return this;
    }

    @Override // defpackage.mxl
    public final void l() {
    }
}
