package com.google.android.apps.messaging.conversation.draft.model;

import android.net.Uri;
import android.os.Parcelable;
import defpackage.apmp;
import defpackage.appq;
import defpackage.apra;
import defpackage.awap;
import defpackage.byza;
import defpackage.doxr;
import defpackage.entd;
import defpackage.uec;
import defpackage.ufc;
import defpackage.ufd;
import defpackage.ufk;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class GalleryContent implements Parcelable, ufd, appq {
    public static final entd o = entd.c("BugleGallery");
    public final AtomicReference p = new AtomicReference();

    public static ufk o() {
        uec uecVar = new uec();
        uecVar.i(-1L);
        uecVar.j(byza.STANDARD);
        uecVar.h = null;
        uecVar.d = null;
        uecVar.c = null;
        uecVar.e = null;
        uecVar.b = false;
        uecVar.f = (byte) (uecVar.f | 4);
        uecVar.g = 1;
        return uecVar;
    }

    @Override // defpackage.apmq
    public abstract Uri c();

    @Override // defpackage.appq
    public abstract Uri d();

    @Override // defpackage.apmq
    public final apra fk() {
        return (apra) this.p.get();
    }

    @Override // defpackage.apmq
    public final /* synthetic */ awap fl() {
        return null;
    }

    @Override // defpackage.doxs
    public final /* synthetic */ doxr fm() {
        return ufc.a(this);
    }

    @Override // defpackage.doxs
    public final /* synthetic */ String fo() {
        return toString();
    }

    @Override // defpackage.apmq
    public final /* synthetic */ boolean fp() {
        return apmp.a(this);
    }

    public abstract ufk g();

    public abstract byza h();

    @Override // defpackage.appq
    public abstract Optional j();

    @Override // defpackage.apqd
    public abstract String k();

    @Override // defpackage.appq
    public abstract int n();

    @Override // defpackage.doxx
    public final /* synthetic */ Object fn() {
        return this;
    }
}
