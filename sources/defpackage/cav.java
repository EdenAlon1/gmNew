package defpackage;

import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cav implements cak {
    private final cak a;
    private final Range b;
    private final Range c;
    private final Set d;

    private cav(cak cakVar) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.a = cakVar;
        int b = cakVar.b();
        this.b = Range.create(Integer.valueOf(b), Integer.valueOf(((int) Math.ceil(4096.0d / b)) * b));
        int a = cakVar.a();
        this.c = Range.create(Integer.valueOf(a), Integer.valueOf(((int) Math.ceil(2160.0d / a)) * a));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.a() ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET);
    }

    public static cak j(cak cakVar, Size size) {
        if (!(cakVar instanceof cav)) {
            if (bwq.a(MediaCodecInfoReportIncorrectInfoQuirk.class) == null) {
                if (size != null && !cakVar.i(size.getWidth(), size.getHeight())) {
                    avw.f("VideoEncoderInfoWrapper", String.format("Detected that the device does not support a size %s that should be valid in widths/heights = %s/%s", size, cakVar.f(), cakVar.d()));
                }
            }
            cakVar = new cav(cakVar);
        }
        if (size != null && (cakVar instanceof cav)) {
            ((cav) cakVar).d.add(size);
        }
        return cakVar;
    }

    @Override // defpackage.cak
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.cak
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.cak
    public final Range c() {
        return this.a.c();
    }

    @Override // defpackage.cak
    public final Range d() {
        return this.c;
    }

    @Override // defpackage.cak
    public final Range e(int i) {
        boolean z = false;
        if (this.b.contains((Range) Integer.valueOf(i)) && i % this.a.b() == 0) {
            z = true;
        }
        ksw.b(z, "Not supported width: " + i + " which is not in " + this.b + " or can not be divided by alignment " + this.a.b());
        return this.c;
    }

    @Override // defpackage.cak
    public final Range f() {
        return this.b;
    }

    @Override // defpackage.cak
    public final Range g(int i) {
        boolean z = false;
        if (this.c.contains((Range) Integer.valueOf(i)) && i % this.a.a() == 0) {
            z = true;
        }
        ksw.b(z, "Not supported height: " + i + " which is not in " + this.c + " or can not be divided by alignment " + this.a.a());
        return this.b;
    }

    @Override // defpackage.cak
    public final boolean h(int i, int i2) {
        if (this.a.h(i, i2)) {
            return true;
        }
        for (Size size : this.d) {
            if (size.getWidth() == i && size.getHeight() == i2) {
                return true;
            }
        }
        return this.b.contains((Range) Integer.valueOf(i)) && this.c.contains((Range) Integer.valueOf(i2)) && i % this.a.b() == 0 && i2 % this.a.a() == 0;
    }

    @Override // defpackage.cak
    public final /* synthetic */ boolean i(int i, int i2) {
        return caj.a(this, i, i2);
    }
}
