package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgk implements dzdv {
    private static final String a = "dzgk";

    @Override // defpackage.dzdv
    public final dzdu a() {
        return new dzgv();
    }

    @Override // defpackage.dzdv
    public final String b() {
        return "link_preview";
    }

    @Override // defpackage.dzdv
    public final void c(dzja dzjaVar, dzqs dzqsVar, dzhn dzhnVar) {
        dyhr.c(a, "Error, received a link preview type message which is unexpected.");
    }

    @Override // defpackage.dzdv
    public final void d(dzja dzjaVar, dzqs dzqsVar, dzhn dzhnVar) {
        dyhr.c(a, "attempt to send a message of type link preview");
    }

    @Override // defpackage.dzdv
    public final void e() {
        erqt.i(true);
    }

    @Override // defpackage.dzdv
    public final ListenableFuture f(dzqs dzqsVar) {
        return erqt.i(dzqsVar);
    }
}
