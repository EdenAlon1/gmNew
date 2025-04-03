package defpackage;

import android.util.Range;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdk {
    public static final bdn a = new bbf("camerax.core.captureConfig.rotation", Integer.TYPE, null);
    public static final bdn b = new bbf("camerax.core.captureConfig.jpegQuality", Integer.class, null);
    public static final bdn c = new bbf("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);
    final List d;
    public final bdp e;
    public final int f;
    public final boolean g;
    public final List h;
    public final boolean i;
    public final bgw j;
    public final bcd k;

    public bdk(List list, bdp bdpVar, int i, boolean z, List list2, boolean z2, bgw bgwVar, bcd bcdVar) {
        this.d = list;
        this.e = bdpVar;
        this.f = i;
        this.h = DesugarCollections.unmodifiableList(list2);
        this.i = z2;
        this.j = bgwVar;
        this.k = bcdVar;
        this.g = z;
    }

    public final int a() {
        Object c2 = this.j.c("CAPTURE_CONFIG_ID_KEY");
        if (c2 == null) {
            return -1;
        }
        return ((Integer) c2).intValue();
    }

    public final int b() {
        Integer num = (Integer) this.e.m(bhh.y, 0);
        num.getClass();
        return num.intValue();
    }

    public final int c() {
        Integer num = (Integer) this.e.m(bhh.z, 0);
        num.getClass();
        return num.intValue();
    }

    public final Range d() {
        Range range = (Range) this.e.m(c, bgr.g);
        range.getClass();
        return range;
    }

    public final List e() {
        return DesugarCollections.unmodifiableList(this.d);
    }
}
