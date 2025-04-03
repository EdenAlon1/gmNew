package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajx {
    public final Object a = new Object();
    public volatile boolean b = false;
    public volatile bgk c;

    public ajx(akt aktVar, List list) {
        int i = aktVar.j;
        int i2 = aktVar.j;
        Objects.toString(akr.a(i2));
        ksw.b(i == 8, "CaptureSession state must be OPENED. Current state:".concat(akr.a(i2)));
        DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
