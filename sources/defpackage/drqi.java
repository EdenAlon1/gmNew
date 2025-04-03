package defpackage;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drqi implements drpz {
    public final Context a;
    public final dqhs b;
    private final drps c;
    private final drpu d;
    private final drql e;
    private final ffsk f;
    private final ffbz g;

    public drqi(Context context, dqhs dqhsVar, drps drpsVar, drpu drpuVar, drql drqlVar, ffsk ffskVar, final ffbr ffbrVar) {
        context.getClass();
        dqhsVar.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        this.a = context;
        this.b = dqhsVar;
        this.c = drpsVar;
        this.d = drpuVar;
        this.e = drqlVar;
        this.f = ffskVar;
        this.g = ffca.a(new ffix() { // from class: drqa
            @Override // defpackage.ffix
            public final Object invoke() {
                Object b = ffbr.this.b();
                b.getClass();
                Optional optional = (Optional) b;
                return (dozj) (optional.isPresent() ? optional.get() : new dozj(null));
            }
        });
    }

    @Override // defpackage.drpz
    public final /* synthetic */ Object a(drpx drpxVar, Uri uri, ffgu ffguVar) {
        if (!dqkt.b(drpxVar.b) || drpxVar.c.compareTo(Duration.ZERO) <= 0) {
            drpxVar = null;
        }
        return drpxVar == null ? d(uri, ffguVar) : drpxVar;
    }

    @Override // defpackage.drpz
    public final Object b(final Uri uri, ffgu ffguVar) {
        return this.c.b(new ffji() { // from class: drqb
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                MediaMetadataRetriever mediaMetadataRetriever = (MediaMetadataRetriever) obj;
                mediaMetadataRetriever.getClass();
                mediaMetadataRetriever.setDataSource(drqi.this.a, uri);
                return ffcu.a;
            }
        }, ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.drpz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.net.Uri r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.drqd
            if (r0 == 0) goto L13
            r0 = r10
            drqd r0 = (defpackage.drqd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            drqd r0 = new drqd
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L49
            if (r2 == r6) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            defpackage.ffci.b(r10)
            return r10
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.ffci.b(r10)
            return r10
        L3d:
            java.lang.Object r9 = r0.a
            drqi r2 = r0.e
            defpackage.ffci.b(r10)
            goto L7e
        L45:
            defpackage.ffci.b(r10)
            return r10
        L49:
            defpackage.ffci.b(r10)
            dozj r10 = r8.e()
            boolean r10 = r10.a
            if (r10 == 0) goto L65
            drpu r10 = r8.d
            drqe r2 = new drqe
            r2.<init>(r8, r9, r7)
            r0.d = r6
            java.lang.Object r9 = r10.a(r2, r0)
            if (r9 != r1) goto L64
            goto Lb2
        L64:
            return r9
        L65:
            r0.e = r8
            r0.a = r9
            r0.d = r5
            ffsk r10 = r8.f
            ffhd r10 = r10.hT()
            drqh r2 = new drqh
            r2.<init>(r9, r8, r7)
            java.lang.Object r10 = defpackage.ffra.a(r10, r2, r0)
            if (r10 != r1) goto L7d
            goto Lb2
        L7d:
            r2 = r8
        L7e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L9d
            r0.e = r7
            r0.a = r7
            r0.d = r4
            drpu r10 = r2.d
            drqg r3 = new drqg
            android.net.Uri r9 = (android.net.Uri) r9
            r3.<init>(r2, r9, r7)
            java.lang.Object r9 = r10.a(r3, r0)
            if (r9 != r1) goto L9c
            goto Lb2
        L9c:
            return r9
        L9d:
            drpu r10 = r2.d
            drqf r4 = new drqf
            android.net.Uri r9 = (android.net.Uri) r9
            r4.<init>(r2, r9, r7)
            r0.e = r7
            r0.a = r7
            r0.d = r3
            java.lang.Object r9 = r10.a(r4, r0)
            if (r9 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drqi.c(android.net.Uri, ffgu):java.lang.Object");
    }

    @Override // defpackage.drpz
    public final Object d(final Uri uri, ffgu ffguVar) {
        return this.e.b(new ffji() { // from class: drqc
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                MediaMetadataRetriever mediaMetadataRetriever = (MediaMetadataRetriever) obj;
                mediaMetadataRetriever.getClass();
                mediaMetadataRetriever.setDataSource(drqi.this.a, uri);
                return ffcu.a;
            }
        }, ffguVar);
    }

    public final dozj e() {
        return (dozj) this.g.a();
    }
}
