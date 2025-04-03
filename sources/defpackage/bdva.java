package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdva {
    public static final entd a = entd.c("BugleShareRecentImage");
    public final Context b;
    public final ffbr c;
    public final bdvd d;
    private final errl g;
    private final erqa h = new erqa();
    public final Object e = new Object();
    public boolean f = false;

    public bdva(Context context, ffbr ffbrVar, errl errlVar, bdvd bdvdVar) {
        this.b = context;
        this.c = ffbrVar;
        this.g = errlVar;
        this.d = bdvdVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x0042
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void a(final com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r9, final java.lang.String r10, final long r11, final java.util.Set r13) {
        /*
            r8 = this;
            boolean r0 = r9.b()
            if (r0 != 0) goto L44
            java.lang.Object r1 = r8.e
            monitor-enter(r1)
            boolean r0 = r8.f     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L15
            r0 = 1
            r8.f = r0     // Catch: java.lang.Throwable -> L11
            goto L16
        L11:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L40
        L15:
            r0 = 0
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L44
            erqa r0 = r8.h
            bduz r1 = new bduz
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r7 = r13
            r1.<init>()
            java.util.concurrent.Callable r9 = defpackage.eldl.m(r1)
            errl r10 = r2.g
            com.google.common.util.concurrent.ListenableFuture r9 = r0.a(r9, r10)
            elfl r9 = defpackage.elfl.g(r9)
            erqj r10 = defpackage.axnw.b()
            erpp r11 = defpackage.erpp.a
            r9.k(r10, r11)
            return
        L3d:
            r0 = move-exception
            r2 = r8
        L3f:
            r9 = r0
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
            throw r9
        L42:
            r0 = move-exception
            goto L3f
        L44:
            r2 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdva.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, java.lang.String, long, java.util.Set):void");
    }
}
