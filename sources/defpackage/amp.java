package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amp {
    bgv a;
    List b;
    private final List c = new ArrayList();
    private final List d = new ArrayList();
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    private final Map g;
    private final List h;
    private final List i;
    private final List j;
    private final String k;
    private final afq l;
    private final apd m;
    private final arf n;
    private final int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private final ala u;
    private final art v;
    private final alb w;

    /* JADX WARN: Removed duplicated region for block: B:36:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0473 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0af2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0c23 A[EDGE_INSN: B:82:0x0c23->B:83:0x0c23 BREAK  A[LOOP:1: B:74:0x0b00->B:77:0x0c1c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0550  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public amp(android.content.Context r17, java.lang.String r18, defpackage.apu r19, defpackage.afq r20) {
        /*
            Method dump skipped, instructions count: 3118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amp.<init>(android.content.Context, java.lang.String, apu, afq):void");
    }

    private static int f(Range range, Range range2) {
        boolean z = false;
        if (!range.contains((Range) range2.getUpper()) && !range.contains((Range) range2.getLower())) {
            z = true;
        }
        ksw.d(z, "Ranges must not intersect");
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    private static int g(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        r2 = new android.util.Size(r7.videoFrameWidth, r7.videoFrameHeight);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r2 != null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h() {
        /*
            r9 = this;
            ala r0 = r9.u
            android.util.Size r4 = r0.b()
            r0 = 0
            r1 = 0
            java.lang.String r2 = r9.k     // Catch: java.lang.NumberFormatException -> L3b
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L3b
            r3 = 8
            int[] r5 = new int[r3]     // Catch: java.lang.NumberFormatException -> L3b
            r5 = {x00a0: FILL_ARRAY_DATA , data: [1, 13, 10, 8, 12, 6, 5, 4} // fill-array     // Catch: java.lang.NumberFormatException -> L3b
            r6 = r0
        L16:
            if (r6 >= r3) goto L37
            r7 = r5[r6]     // Catch: java.lang.NumberFormatException -> L3b
            afq r8 = r9.l     // Catch: java.lang.NumberFormatException -> L3b
            boolean r8 = r8.b(r2, r7)     // Catch: java.lang.NumberFormatException -> L3b
            if (r8 == 0) goto L34
            afq r8 = r9.l     // Catch: java.lang.NumberFormatException -> L3b
            android.media.CamcorderProfile r7 = r8.a(r2, r7)     // Catch: java.lang.NumberFormatException -> L3b
            if (r7 == 0) goto L34
            android.util.Size r2 = new android.util.Size     // Catch: java.lang.NumberFormatException -> L3b
            int r3 = r7.videoFrameWidth     // Catch: java.lang.NumberFormatException -> L3b
            int r5 = r7.videoFrameHeight     // Catch: java.lang.NumberFormatException -> L3b
            r2.<init>(r3, r5)     // Catch: java.lang.NumberFormatException -> L3b
            goto L38
        L34:
            int r6 = r6 + 1
            goto L16
        L37:
            r2 = r1
        L38:
            if (r2 == 0) goto L3b
            goto L7f
        L3b:
            apd r2 = r9.m
            aqa r2 = r2.b()
            android.hardware.camera2.params.StreamConfigurationMap r2 = r2.a()     // Catch: java.lang.Throwable -> L4c
            java.lang.Class<android.media.MediaRecorder> r3 = android.media.MediaRecorder.class
            android.util.Size[] r2 = r2.getOutputSizes(r3)     // Catch: java.lang.Throwable -> L4c
            goto L4d
        L4c:
            r2 = r1
        L4d:
            if (r2 != 0) goto L50
            goto L7b
        L50:
            bhu r3 = new bhu
            r5 = 1
            r3.<init>(r5)
            java.util.Arrays.sort(r2, r3)
        L59:
            int r3 = r2.length
            if (r0 >= r3) goto L7b
            r3 = r2[r0]
            int r5 = r3.getWidth()
            android.util.Size r6 = defpackage.blz.f
            int r6 = r6.getWidth()
            if (r5 > r6) goto L78
            int r5 = r3.getHeight()
            android.util.Size r6 = defpackage.blz.f
            int r6 = r6.getHeight()
            if (r5 > r6) goto L78
            r1 = r3
            goto L7b
        L78:
            int r0 = r0 + 1
            goto L59
        L7b:
            if (r1 != 0) goto L81
            android.util.Size r2 = defpackage.blz.d
        L7f:
            r6 = r2
            goto L82
        L81:
            r6 = r1
        L82:
            android.util.Size r2 = defpackage.blz.c
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            bbs r1 = new bbs
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amp.h():void");
    }

    private final void i(Map map, Size size, int i) {
        if (this.r) {
            Size j = j(this.m.b().a(), i, false);
            Integer valueOf = Integer.valueOf(i);
            if (j != null) {
                size = (Size) Collections.min(Arrays.asList(size, j), new bhu());
            }
            map.put(valueOf, size);
        }
    }

    private static final Size j(StreamConfigurationMap streamConfigurationMap, int i, boolean z) {
        Size[] sizeArr;
        Size[] highResolutionOutputSizes;
        try {
            sizeArr = i == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i);
        } catch (Throwable unused) {
            sizeArr = null;
        }
        if (sizeArr == null || sizeArr.length == 0) {
            return null;
        }
        bhu bhuVar = new bhu();
        Size size = (Size) Collections.max(Arrays.asList(sizeArr), bhuVar);
        Size size2 = blz.a;
        if (z && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i)) != null && highResolutionOutputSizes.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), bhuVar);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), bhuVar);
    }

    private final int k(int i, int i2, Size size) {
        return Math.min(i, m(i2, size));
    }

    private static final Range l(Range range, Range range2) {
        if (range2 == null) {
            return range;
        }
        if (range != null) {
            try {
                return range2.intersect(range);
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    private final int m(int i, Size size) {
        try {
            return (int) (1.0E9d / ((StreamConfigurationMap) this.m.c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i, size));
        } catch (Exception unused) {
            return 0;
        }
    }

    private final Pair n(List list, List list2, List list3, List list4, int i, Map map, Map map2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bbc bbcVar = (bbc) it.next();
            arrayList.add(bbcVar.g());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), bbcVar);
            }
        }
        for (int i2 = 0; i2 < list2.size(); i2++) {
            Size size = (Size) list2.get(i2);
            bhh bhhVar = (bhh) list3.get(((Integer) list4.get(i2)).intValue());
            int a = bhhVar.a();
            arrayList.add(bgu.e(a, size, a(a)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), bhhVar);
            }
            i = k(i, bhhVar.a(), size);
        }
        return new Pair(arrayList, Integer.valueOf(i));
    }

    final bgv a(int i) {
        CameraCharacteristics.Key key;
        List list = this.b;
        Integer valueOf = Integer.valueOf(i);
        if (!list.contains(valueOf)) {
            i(((bbs) this.a).b, blz.e, i);
            i(((bbs) this.a).d, blz.g, i);
            Map map = ((bbs) this.a).f;
            Size j = j(this.m.b().a(), i, true);
            if (j != null) {
                map.put(valueOf, j);
            }
            Map map2 = ((bbs) this.a).g;
            if (Build.VERSION.SDK_INT >= 31 && this.t) {
                apd apdVar = this.m;
                key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) apdVar.c(key);
                if (streamConfigurationMap != null) {
                    map2.put(valueOf, j(streamConfigurationMap, i, true));
                }
            }
            this.b.add(valueOf);
        }
        return this.a;
    }

    final List b(amo amoVar, List list) {
        bdn bdnVar = amn.a;
        if (((afp) amoVar).a != 8) {
            return null;
        }
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            List a = ((bgs) it.next()).a(list);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    final boolean c(amo amoVar, List list) {
        List list2;
        if (this.g.containsKey(amoVar)) {
            list2 = (List) this.g.get(amoVar);
        } else {
            ArrayList arrayList = new ArrayList();
            afp afpVar = (afp) amoVar;
            if (afpVar.c) {
                if (this.i.isEmpty()) {
                    List list3 = this.i;
                    ArrayList arrayList2 = new ArrayList();
                    bgs bgsVar = new bgs();
                    bgsVar.b(new bbr(4, bgt.MAXIMUM, 0L));
                    arrayList2.add(bgsVar);
                    bgs bgsVar2 = new bgs();
                    bgsVar2.b(new bbr(1, bgt.PREVIEW, 0L));
                    bgsVar2.b(new bbr(4, bgt.MAXIMUM, 0L));
                    arrayList2.add(bgsVar2);
                    list3.addAll(arrayList2);
                }
                arrayList.addAll(this.i);
            } else {
                int i = afpVar.a;
                if (i == 8) {
                    arrayList.addAll(afpVar.b ? this.f : this.c);
                } else if (i == 10) {
                    arrayList.addAll(this.h);
                }
            }
            this.g.put(amoVar, arrayList);
            list2 = arrayList;
        }
        Iterator it = list2.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z = ((bgs) it.next()).a(list) != null;
            if (z) {
                break;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Type inference failed for: r3v35, types: [bdp, bfz] */
    /* JADX WARN: Type inference failed for: r4v23, types: [bdp, bfz] */
    /* JADX WARN: Type inference failed for: r5v40, types: [bdp, bfz] */
    /* JADX WARN: Type inference failed for: r6v32, types: [bdp, bfz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair d(java.util.List r33, java.util.Map r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 2799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amp.d(java.util.List, java.util.Map, boolean, boolean):android.util.Pair");
    }

    public final bgu e(int i, Size size) {
        return bgu.e(i, size, a(i));
    }
}
