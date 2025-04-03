package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btz extends axv {
    public static final /* synthetic */ int h = 0;
    bdy a;
    btf b;
    bgc c;
    ListenableFuture d;
    public axt e;
    public boolean f;
    int g;
    private bnr i;
    private boc s;
    private Rect t;
    private int u;
    private bty v;
    private bgd w;
    private final bfk x;

    static {
        buu buuVar = btx.a;
    }

    public btz(buu buuVar) {
        super(buuVar);
        this.b = btf.a;
        this.c = new bgc();
        this.d = null;
        this.g = 3;
        this.f = false;
        Map map = Collections.EMPTY_MAP;
        this.x = new btr(this);
    }

    private final brd X() {
        return (brd) aa(a().a(), null);
    }

    private final bth Y(ati atiVar) {
        return a().f(atiVar);
    }

    private static cak Z(afd afdVar, bvc bvcVar, brd brdVar, Size size, aua auaVar, Range range) {
        cak cakVar = (cak) afdVar.a(bxe.e(bxe.b(brdVar, auaVar, bvcVar), 1, brdVar.c(), size, auaVar, range));
        if (cakVar != null) {
            return cav.j(cakVar, bvcVar != null ? new Size(bvcVar.f().i(), bvcVar.f().g()) : null);
        }
        avw.f("VideoCapture", "Can't find videoEncoderInfo");
        return null;
    }

    private static Object aa(bfl bflVar, Object obj) {
        ListenableFuture b = bflVar.b();
        if (!b.isDone()) {
            return obj;
        }
        try {
            return b.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    private static void ab(Set set, int i, int i2, Size size, cak cakVar) {
        if (i > size.getWidth() || i2 > size.getHeight()) {
            return;
        }
        try {
            set.add(new Size(i, ((Integer) cakVar.e(i).clamp(Integer.valueOf(i2))).intValue()));
        } catch (IllegalArgumentException e) {
            avw.g("VideoCapture", a.h(i, "No supportedHeights for width: "), e);
        }
        try {
            set.add(new Size(((Integer) cakVar.g(i2).clamp(Integer.valueOf(i))).intValue(), i2));
        } catch (IllegalArgumentException e2) {
            avw.g("VideoCapture", a.h(i2, "No supportedWidths for height: "), e2);
        }
    }

    private final boolean ac(bct bctVar, buu buuVar, Rect rect, Size size) {
        if (this.o != null) {
            return true;
        }
        if (bctVar.H()) {
            Boolean bool = (Boolean) bfy.c(buuVar, buu.c, false);
            bool.getClass();
            if (bool.booleanValue()) {
                return true;
            }
        }
        return (bctVar.H() && (blq.a(bwq.a) || blq.a(bctVar.f().g()))) || size.getWidth() != rect.width() || size.getHeight() != rect.height() || ae(bctVar) || ad();
    }

    private final boolean ad() {
        return this.b.b() != null;
    }

    private final boolean ae(bct bctVar) {
        return bctVar.H() && T(bctVar);
    }

    private static int s(boolean z, int i, int i2, Range range) {
        int i3 = i % i2;
        if (i3 != 0) {
            i = z ? i - i3 : i + (i2 - i3);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    private static int t(int i, int i2, Range range) {
        return s(true, i, i2, range);
    }

    private static int u(int i, int i2, Range range) {
        return s(false, i, i2, range);
    }

    private final int v(bct bctVar) {
        boolean T = T(bctVar);
        int B = B(bctVar, T);
        if (!ad()) {
            return B;
        }
        axr b = this.b.b();
        b.getClass();
        asz aszVar = (asz) b;
        boolean z = aszVar.f;
        int i = aszVar.b;
        if (T != z) {
            i = -i;
        }
        return bix.b(B - i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [int] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v35 */
    private final bgc w(final buu buuVar, bgr bgrVar) {
        cak cakVar;
        boolean z;
        boolean z2;
        Rect rect;
        Size size;
        boolean z3;
        boc bocVar;
        final boolean z4;
        final int i;
        biw.b();
        final bct F = F();
        ksw.h(F);
        Size c = bgrVar.c();
        Runnable runnable = new Runnable() { // from class: btk
            @Override // java.lang.Runnable
            public final void run() {
                btz.this.L();
            }
        };
        Range a = bgrVar.a();
        if (Objects.equals(a, bgr.g)) {
            a = btx.b;
        }
        Range range = a;
        brd X = X();
        X.getClass();
        bth Y = Y(F.c());
        aua d = bgrVar.d();
        cak Z = Z(buuVar.C(), Y.b(c, d), X, c, d, range);
        this.u = v(F);
        final Rect rect2 = this.m;
        if (rect2 == null) {
            rect2 = new Rect(0, 0, c.getWidth(), c.getHeight());
        }
        if (Z == null || Z.i(rect2.width(), rect2.height())) {
            cakVar = Z;
            z = false;
            z2 = true;
        } else {
            z2 = true;
            avw.a("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", bix.l(rect2), Integer.valueOf(Z.b()), Integer.valueOf(Z.a()), Z.f(), Z.d()));
            cak caeVar = (!(Z.f().contains((Range) Integer.valueOf(rect2.width())) && Z.d().contains((Range) Integer.valueOf(rect2.height()))) && Z.d().contains((Range) Integer.valueOf(rect2.width())) && Z.f().contains((Range) Integer.valueOf(rect2.height()))) ? new cae(Z) : Z;
            int b = caeVar.b();
            int a2 = caeVar.a();
            Range f = caeVar.f();
            Range d2 = caeVar.d();
            int t = t(rect2.width(), b, f);
            cakVar = Z;
            int u = u(rect2.width(), b, f);
            int t2 = t(rect2.height(), a2, d2);
            int u2 = u(rect2.height(), a2, d2);
            HashSet hashSet = new HashSet();
            ab(hashSet, t, t2, c, caeVar);
            ab(hashSet, t, u2, c, caeVar);
            ab(hashSet, u, t2, c, caeVar);
            ab(hashSet, u, u2, c, caeVar);
            if (hashSet.isEmpty()) {
                avw.f("VideoCapture", "Can't find valid cropped size");
            } else {
                ArrayList arrayList = new ArrayList(hashSet);
                arrayList.toString();
                avw.a("VideoCapture", "candidatesList = ".concat(arrayList.toString()));
                Collections.sort(arrayList, new Comparator() { // from class: btp
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        Size size2 = (Size) obj;
                        Size size3 = (Size) obj2;
                        int i2 = btz.h;
                        int width = size2.getWidth();
                        Rect rect3 = rect2;
                        return (Math.abs(width - rect3.width()) + Math.abs(size2.getHeight() - rect3.height())) - (Math.abs(size3.getWidth() - rect3.width()) + Math.abs(size3.getHeight() - rect3.height()));
                    }
                });
                arrayList.toString();
                avw.a("VideoCapture", "sorted candidatesList = ".concat(arrayList.toString()));
                Size size2 = (Size) arrayList.get(0);
                int width = size2.getWidth();
                int height = size2.getHeight();
                if (width == rect2.width() && height == rect2.height()) {
                    avw.a("VideoCapture", "No need to adjust cropRect because crop size is valid.");
                } else {
                    ksw.c(width % 2 == 0 && height % 2 == 0 && width <= c.getWidth() && height <= c.getHeight());
                    Rect rect3 = new Rect(rect2);
                    if (width != rect2.width()) {
                        rect3.left = Math.max(0, rect2.centerX() - (width / 2));
                        rect3.right = rect3.left + width;
                        if (rect3.right > c.getWidth()) {
                            rect3.right = c.getWidth();
                            rect3.left = rect3.right - width;
                        }
                    }
                    if (height != rect2.height()) {
                        rect3.top = Math.max(0, rect2.centerY() - (height / 2));
                        rect3.bottom = rect3.top + height;
                        if (rect3.bottom > c.getHeight()) {
                            rect3.bottom = c.getHeight();
                            rect3.top = rect3.bottom - height;
                        }
                    }
                    z = false;
                    avw.a("VideoCapture", String.format("Adjust cropRect from %s to %s", bix.l(rect2), bix.l(rect3)));
                    rect2 = rect3;
                }
            }
            z = false;
        }
        int i2 = this.u;
        if (ad()) {
            axr b2 = this.b.b();
            ksw.h(b2);
            rect = bix.f(bix.h(((asz) b2).a, i2));
        } else {
            rect = rect2;
        }
        this.t = rect;
        if (!ad() || rect.equals(rect2)) {
            size = c;
        } else {
            float height2 = rect.height() / rect2.height();
            size = new Size((int) Math.ceil(c.getWidth() * height2), (int) Math.ceil(c.getHeight() * height2));
        }
        if (ad()) {
            z3 = z2;
            this.f = z3;
        } else {
            z3 = z2;
        }
        Rect rect4 = this.t;
        int i3 = this.u;
        boolean ac = ac(F, buuVar, rect4, c);
        ?? r7 = i3;
        if (((SizeCannotEncodeVideoQuirk) bwq.a(SizeCannotEncodeVideoQuirk.class)) != null) {
            if (z3 != ac) {
                r7 = z;
            }
            Size k = bix.k(bix.i(rect4), r7);
            if ((SizeCannotEncodeVideoQuirk.a() ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.EMPTY_SET).contains(k)) {
                int a3 = cakVar != null ? cakVar.a() / 2 : 8;
                Rect rect5 = new Rect(rect4);
                if (rect4.width() == k.getHeight()) {
                    rect5.left += a3;
                    rect5.right -= a3;
                } else {
                    rect5.top += a3;
                    rect5.bottom -= a3;
                }
                rect4 = rect5;
            }
        }
        this.t = rect4;
        if (ac(F, buuVar, rect4, c)) {
            avw.a("VideoCapture", "Surface processing is enabled.");
            bct F2 = F();
            F2.getClass();
            atd atdVar = this.o;
            bocVar = new boc(F2, atdVar != null ? new bof(atdVar) : bmu.a(d));
        } else {
            bocVar = null;
        }
        this.s = bocVar;
        boolean z5 = (F.H() && this.s == null) ? z : z3;
        int s = (this.s == null && F.H()) ? z3 : F.f().s();
        avw.a("VideoCapture", "camera timebase = " + ((Object) bgx.a(F.f().s())) + ", processing timebase = " + ((Object) bgx.a(s)));
        bgq f2 = bgrVar.f();
        f2.d(size);
        f2.b(range);
        bgr a4 = f2.a();
        ksw.c(this.i == null ? z3 : z);
        bnr bnrVar = new bnr(2, 34, a4, this.n, F.H(), this.t, this.u, x(), ae(F));
        this.i = bnrVar;
        bnrVar.e(runnable);
        if (this.s != null) {
            bou i4 = bou.i(this.i);
            final bnr bnrVar2 = (bnr) this.s.a(new bmd(this.i, Collections.singletonList(i4))).get(i4);
            bnrVar2.getClass();
            z4 = z5;
            i = s;
            bnrVar2.e(new Runnable() { // from class: btl
                @Override // java.lang.Runnable
                public final void run() {
                    bct bctVar = F;
                    btz btzVar = btz.this;
                    if (bctVar == btzVar.F()) {
                        boolean z6 = z4;
                        int i5 = i;
                        buu buuVar2 = buuVar;
                        btzVar.e = bnrVar2.a(bctVar);
                        buuVar2.G().D(btzVar.e, i5, z6);
                        btzVar.m();
                    }
                }
            });
            this.e = bnrVar2.a(F);
            final bdy c2 = this.i.c();
            this.a = c2;
            c2.c().b(new Runnable() { // from class: btm
                @Override // java.lang.Runnable
                public final void run() {
                    bdy bdyVar = c2;
                    btz btzVar = btz.this;
                    if (bdyVar == btzVar.a) {
                        btzVar.c();
                    }
                }
            }, bjm.a());
        } else {
            z4 = z5;
            i = s;
            axt a5 = this.i.a(F);
            this.e = a5;
            this.a = a5.i;
        }
        buuVar.G().D(this.e, i, z4);
        m();
        this.a.n = MediaCodec.class;
        bgc a6 = bgc.a(buuVar, bgrVar.c());
        J(a6, bgrVar);
        a6.u(bhe.b(buuVar));
        bgd bgdVar = this.w;
        if (bgdVar != null) {
            bgdVar.b();
        }
        bgd bgdVar2 = new bgd(new bge() { // from class: btn
            @Override // defpackage.bge
            public final void a(bgk bgkVar) {
                btz.this.h();
            }
        });
        this.w = bgdVar2;
        a6.f = bgdVar2;
        if (bgrVar.e() != null) {
            a6.h(bgrVar.e());
        }
        return a6;
    }

    @Override // defpackage.axv
    public final void N() {
        avw.a("VideoCapture", "VideoCapture#onStateAttached: cameraID = ".concat(H()));
        bgr bgrVar = this.l;
        if (bgrVar == null || this.e != null) {
            return;
        }
        this.b = (btf) aa(a().b(), btf.a);
        bgc w = w((buu) this.k, bgrVar);
        this.c = w;
        b(w, this.b, bgrVar);
        Q(bti.a(new Object[]{this.c.b()}));
        K();
        a().b().c(bjm.a(), this.x);
        bty btyVar = this.v;
        if (btyVar != null) {
            btyVar.c();
        }
        this.v = new bty(E());
        a().c().c(bjm.a(), this.v);
        r(2);
    }

    public final bul a() {
        return ((buu) this.k).G();
    }

    @Override // defpackage.axv
    public final Set af() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    final void b(final bgc bgcVar, btf btfVar, bgr bgrVar) {
        bdy bdyVar;
        int a = btfVar.a();
        boolean z = btfVar.c() == 1;
        boolean z2 = a == -1;
        if (z2 && z) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        bgcVar.a.clear();
        bgcVar.b.i();
        aua d = bgrVar.d();
        if (!z2 && (bdyVar = this.a) != null) {
            if (z) {
                bgcVar.n(bdyVar, d, -1);
            } else {
                bgcVar.j(bdyVar, d);
            }
        }
        ListenableFuture listenableFuture = this.d;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            avw.a("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        ListenableFuture a2 = kfg.a(new kfd() { // from class: btj
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                Integer valueOf = Integer.valueOf(kfbVar.hashCode());
                final bgc bgcVar2 = bgc.this;
                bgcVar2.o("androidx.camera.video.VideoCapture.streamUpdate", valueOf);
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final btt bttVar = new btt(atomicBoolean, kfbVar, bgcVar2);
                kfbVar.a(new Runnable() { // from class: bto
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = btz.h;
                        ksw.d(biw.d(), "Surface update cancellation should only occur on main thread.");
                        atomicBoolean.set(true);
                        bgcVar2.p(bttVar);
                    }
                }, bjb.a());
                bgcVar2.k(bttVar);
                return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(kfbVar.hashCode()));
            }
        });
        this.d = a2;
        bkj.i(a2, new btu(this, a2, z), bjm.a());
    }

    public final void c() {
        biw.b();
        bgd bgdVar = this.w;
        if (bgdVar != null) {
            bgdVar.b();
            this.w = null;
        }
        bdy bdyVar = this.a;
        if (bdyVar != null) {
            bdyVar.d();
            this.a = null;
        }
        boc bocVar = this.s;
        if (bocVar != null) {
            bocVar.c();
            this.s = null;
        }
        bnr bnrVar = this.i;
        if (bnrVar != null) {
            bnrVar.g();
            this.i = null;
        }
        this.t = null;
        this.e = null;
        this.b = btf.a;
        this.u = 0;
        this.f = false;
    }

    @Override // defpackage.axv
    public final bgr d(bdp bdpVar) {
        this.c.h(bdpVar);
        Q(bti.a(new Object[]{this.c.b()}));
        bgr bgrVar = this.l;
        bgrVar.getClass();
        bgq f = bgrVar.f();
        ((bbp) f).b = bdpVar;
        return f.a();
    }

    @Override // defpackage.axv
    public final bhg e(bdp bdpVar) {
        return btv.a(bdpVar);
    }

    @Override // defpackage.axv
    public final bhh f(boolean z, bhl bhlVar) {
        bdp a = bhlVar.a(bhe.f(btx.a), 1);
        if (z) {
            a = bdm.a(a, btx.a);
        }
        if (a == null) {
            return null;
        }
        return btv.a(a).c();
    }

    @Override // defpackage.axv
    protected final bhh g(bcq bcqVar, bhg bhgVar) {
        ArrayList<brk> arrayList;
        LinkedHashMap linkedHashMap;
        bvc b;
        aua auaVar;
        cak cakVar;
        afd afdVar;
        int i;
        brd X = X();
        ksw.b(X != null, "Unable to update target resolution by null MediaSpec.");
        aua f = this.k.t() ? this.k.f() : btx.c;
        bth Y = Y(bcqVar);
        List d = Y.d(f);
        if (d.isEmpty()) {
            avw.f("VideoCapture", "Can't find any supported quality on the device.");
        } else {
            bqv bqvVar = (bqv) X.c();
            bro broVar = bqvVar.a;
            if (d.isEmpty()) {
                avw.f("QualitySelector", "No supported quality on the device.");
                arrayList = new ArrayList();
            } else {
                java.util.Objects.toString(d);
                avw.a("QualitySelector", "supportedQualities = ".concat(d.toString()));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = broVar.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    brk brkVar = (brk) it.next();
                    if (brkVar == brk.g) {
                        linkedHashSet.addAll(d);
                        break;
                    }
                    if (brkVar == brk.f) {
                        ArrayList arrayList2 = new ArrayList(d);
                        Collections.reverse(arrayList2);
                        linkedHashSet.addAll(arrayList2);
                        break;
                    }
                    if (d.contains(brkVar)) {
                        linkedHashSet.add(brkVar);
                    } else {
                        java.util.Objects.toString(brkVar);
                        avw.f("QualitySelector", "quality is not supported and will be ignored: ".concat(String.valueOf(brkVar)));
                    }
                }
                if (!d.isEmpty() && !linkedHashSet.containsAll(d)) {
                    bqy bqyVar = broVar.b;
                    java.util.Objects.toString(bqyVar);
                    avw.a("QualitySelector", "Select quality by fallbackStrategy = ".concat(bqyVar.toString()));
                    if (broVar.b != bqy.c) {
                        ksw.d(true, "Currently only support type RuleStrategy");
                        bqy bqyVar2 = broVar.b;
                        brk brkVar2 = brk.b;
                        ArrayList arrayList3 = new ArrayList(brk.i);
                        bqj bqjVar = (bqj) bqyVar2;
                        brk brkVar3 = bqjVar.a;
                        if (brkVar3 == brk.g) {
                            brkVar3 = (brk) arrayList3.get(0);
                        } else if (brkVar3 == brk.f) {
                            brkVar3 = (brk) arrayList3.get(arrayList3.size() - 1);
                        }
                        int indexOf = arrayList3.indexOf(brkVar3);
                        ksw.c(indexOf != -1);
                        ArrayList arrayList4 = new ArrayList();
                        for (int i2 = indexOf - 1; i2 >= 0; i2--) {
                            brk brkVar4 = (brk) arrayList3.get(i2);
                            if (d.contains(brkVar4)) {
                                arrayList4.add(brkVar4);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        while (true) {
                            indexOf++;
                            if (indexOf >= arrayList3.size()) {
                                break;
                            }
                            brk brkVar5 = (brk) arrayList3.get(indexOf);
                            if (d.contains(brkVar5)) {
                                arrayList5.add(brkVar5);
                            }
                        }
                        avw.a("QualitySelector", "sizeSortedQualities = " + arrayList3 + ", fallback quality = " + brkVar3 + ", largerQualities = " + arrayList4 + ", smallerQualities = " + arrayList5);
                        int i3 = bqjVar.b;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                linkedHashSet.addAll(arrayList4);
                                linkedHashSet.addAll(arrayList5);
                            } else if (i3 == 2) {
                                linkedHashSet.addAll(arrayList4);
                            } else if (i3 != 3) {
                                linkedHashSet.addAll(arrayList5);
                            } else {
                                linkedHashSet.addAll(arrayList5);
                                linkedHashSet.addAll(arrayList4);
                            }
                        }
                    }
                }
                arrayList = new ArrayList(linkedHashSet);
            }
            avw.a("VideoCapture", a.j(broVar, arrayList, "Found selectedQualities ", " by "));
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
            }
            int i4 = bqvVar.d;
            HashMap hashMap = new HashMap();
            for (brk brkVar6 : Y.d(f)) {
                bvc c = Y.c(brkVar6, f);
                c.getClass();
                beh f2 = c.f();
                hashMap.put(brkVar6, new Size(f2.i(), f2.g()));
            }
            brn brnVar = new brn(bcqVar.m(y()), hashMap);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (brk brkVar7 : arrayList) {
                List a = brnVar.a(brkVar7, i4);
                linkedHashMap2.put(brkVar7, a != null ? new ArrayList(a) : new ArrayList(0));
            }
            buu buuVar = (buu) bhgVar.c();
            if (linkedHashMap2.isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            } else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    ArrayList arrayList6 = new ArrayList((Collection) entry.getValue());
                    Iterator it2 = arrayList6.iterator();
                    while (it2.hasNext()) {
                        Size size = (Size) it2.next();
                        if (!hashMap.containsValue(size) && (b = Y.b(size, f)) != null) {
                            afd C = buuVar.C();
                            Range c2 = bhe.c(buuVar, btx.b);
                            c2.getClass();
                            if (f.b()) {
                                cakVar = Z(C, b, X, size, f, c2);
                                auaVar = f;
                            } else {
                                auaVar = f;
                                int i5 = Integer.MIN_VALUE;
                                cak cakVar2 = null;
                                for (beh behVar : b.d()) {
                                    buu buuVar2 = buuVar;
                                    if (cao.a(behVar, auaVar)) {
                                        int i6 = i5;
                                        int f3 = behVar.f();
                                        Map map = cao.d;
                                        afd afdVar2 = C;
                                        Integer valueOf = Integer.valueOf(f3);
                                        ksw.a(map.containsKey(valueOf));
                                        Integer num = (Integer) cao.d.get(valueOf);
                                        num.getClass();
                                        int intValue = num.intValue();
                                        int a2 = behVar.a();
                                        Map map2 = cao.c;
                                        bvc bvcVar = b;
                                        Integer valueOf2 = Integer.valueOf(a2);
                                        ksw.a(map2.containsKey(valueOf2));
                                        Integer num2 = (Integer) cao.c.get(valueOf2);
                                        num2.getClass();
                                        aua auaVar2 = new aua(intValue, num2.intValue());
                                        i = i6;
                                        b = bvcVar;
                                        cak Z = Z(afdVar2, b, X, size, auaVar2, c2);
                                        if (Z != null) {
                                            int intValue2 = ((Integer) Z.f().getUpper()).intValue();
                                            int intValue3 = ((Integer) Z.d().getUpper()).intValue();
                                            Size size2 = blz.a;
                                            afdVar = afdVar2;
                                            int i7 = intValue2 * intValue3;
                                            if (i7 > i) {
                                                buuVar = buuVar2;
                                                cakVar2 = Z;
                                                i5 = i7;
                                                C = afdVar;
                                            }
                                        } else {
                                            afdVar = afdVar2;
                                        }
                                    } else {
                                        afdVar = C;
                                        i = i5;
                                    }
                                    i5 = i;
                                    C = afdVar;
                                    buuVar = buuVar2;
                                }
                                cakVar = cakVar2;
                            }
                            buu buuVar3 = buuVar;
                            if (cakVar != null && !cakVar.i(size.getWidth(), size.getHeight())) {
                                it2.remove();
                            }
                            buuVar = buuVar3;
                            f = auaVar;
                        }
                    }
                    buu buuVar4 = buuVar;
                    aua auaVar3 = f;
                    if (!arrayList6.isEmpty()) {
                        linkedHashMap3.put((brk) entry.getKey(), arrayList6);
                    }
                    buuVar = buuVar4;
                    f = auaVar3;
                }
                linkedHashMap = linkedHashMap3;
            }
            ArrayList arrayList7 = new ArrayList();
            Iterator it3 = linkedHashMap.values().iterator();
            while (it3.hasNext()) {
                arrayList7.addAll((List) it3.next());
            }
            arrayList7.toString();
            avw.a("VideoCapture", "Set custom ordered resolutions = ".concat(arrayList7.toString()));
            bhgVar.f().c(bet.N, arrayList7);
        }
        return bhgVar.c();
    }

    final void h() {
        if (F() == null) {
            return;
        }
        c();
        buu buuVar = (buu) this.k;
        bgr bgrVar = this.l;
        ksw.h(bgrVar);
        bgc w = w(buuVar, bgrVar);
        this.c = w;
        b(w, this.b, this.l);
        Q(bti.a(new Object[]{this.c.b()}));
        L();
    }

    @Override // defpackage.axv
    public final void l(Rect rect) {
        this.m = rect;
        m();
    }

    public final void m() {
        bct F = F();
        bnr bnrVar = this.i;
        if (F == null || bnrVar == null) {
            return;
        }
        int v = v(F);
        this.u = v;
        bnrVar.k(v, x());
    }

    @Override // defpackage.axv
    protected final void p(bgr bgrVar, bgr bgrVar2) {
        java.util.Objects.toString(bgrVar);
        avw.a("VideoCapture", "onSuggestedStreamSpecUpdated: ".concat(bgrVar.toString()));
        List g = ber.g((buu) this.k);
        if (g == null || g.contains(bgrVar.c())) {
            return;
        }
        avw.f("VideoCapture", "suggested resolution " + bgrVar.c() + " is not in custom ordered resolutions " + g);
    }

    @Override // defpackage.axv
    public final void q() {
        avw.a("VideoCapture", "VideoCapture#onStateDetached");
        ksw.d(biw.d(), "VideoCapture can only be detached on the main thread.");
        if (this.v != null) {
            a().c().d(this.v);
            this.v.c();
            this.v = null;
        }
        r(3);
        a().b().d(this.x);
        ListenableFuture listenableFuture = this.d;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            avw.a("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        c();
    }

    final void r(int i) {
        if (i != this.g) {
            this.g = i;
            a().C(i);
        }
    }

    public final String toString() {
        return "VideoCapture:".concat(I());
    }
}
