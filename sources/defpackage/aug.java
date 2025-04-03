package defpackage;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aug implements avr {
    protected final avr a;
    private final Object b = new Object();
    private final Set c = new HashSet();

    protected aug(avr avrVar) {
        this.a = avrVar;
    }

    @Override // defpackage.avr
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.avr
    public int b() {
        return this.a.b();
    }

    @Override // defpackage.avr
    public int c() {
        return this.a.c();
    }

    @Override // defpackage.avr, java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.a.close();
        synchronized (this.b) {
            hashSet = new HashSet(this.c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((auf) it.next()).k(this);
        }
    }

    @Override // defpackage.avr
    public final Image d() {
        return this.a.d();
    }

    @Override // defpackage.avr
    public avm e() {
        return this.a.e();
    }

    @Override // defpackage.avr
    public final avq[] f() {
        return this.a.f();
    }

    public final void g(auf aufVar) {
        synchronized (this.b) {
            this.c.add(aufVar);
        }
    }
}
