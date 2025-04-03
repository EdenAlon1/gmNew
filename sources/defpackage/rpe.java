package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rpe {
    public static final rpe a = new rpe();
    public final ArrayList b;
    public final List c;
    public rpc d;

    public rpe() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        DesugarCollections.unmodifiableList(arrayList);
        this.c = new CopyOnWriteArrayList();
    }
}
