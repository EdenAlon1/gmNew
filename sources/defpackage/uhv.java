package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uhv implements dbzn {
    final /* synthetic */ uhx a;

    public uhv(uhx uhxVar) {
        this.a = uhxVar;
    }

    @Override // defpackage.dbzn
    public final /* synthetic */ void a(ufd ufdVar, dcle dcleVar, boolean z) {
        dbzm.a(this, ufdVar, dcleVar, z);
    }

    @Override // defpackage.dbzn
    public final /* synthetic */ void b(MediaContentItem mediaContentItem, dcle dcleVar, boolean z) {
        dbzm.b(this, mediaContentItem, dcleVar, z);
    }

    @Override // defpackage.dbzn
    public final void c(ufd ufdVar, dcle dcleVar, boolean z, int i) {
        int c;
        if (z) {
            uhx uhxVar = this.a;
            uhxVar.j.f(uhxVar.a.a(ufdVar, dcleVar));
            c = -1;
        } else {
            uhx uhxVar2 = this.a;
            c = uhxVar2.j.c(uhxVar2.a.a(ufdVar, dcleVar));
        }
        uhx uhxVar3 = this.a;
        uhxVar3.b.c(dclb.a(ufdVar, dcleVar), c, i);
    }

    @Override // defpackage.dbzn
    public final void d(MediaContentItem mediaContentItem, dcle dcleVar, boolean z, int i) {
        int c;
        if (z) {
            uhx uhxVar = this.a;
            uhxVar.j.f(uhxVar.f.a(mediaContentItem, dcleVar));
            c = -1;
        } else {
            uhx uhxVar2 = this.a;
            c = uhxVar2.j.c(uhxVar2.f.a(mediaContentItem, dcleVar));
        }
        uhx uhxVar3 = this.a;
        uhxVar3.b.c(dcll.a(mediaContentItem, dcleVar), c, i);
    }

    @Override // defpackage.dbzn
    public final /* synthetic */ void e(ufd ufdVar, dcle dcleVar) {
        dbzm.c(this, ufdVar, dcleVar);
    }

    @Override // defpackage.dbzn
    public final /* synthetic */ void f(MediaContentItem mediaContentItem, dcle dcleVar) {
        dbzm.d(this, mediaContentItem, dcleVar);
    }

    @Override // defpackage.dbzn
    public final void g(ufd ufdVar, dcle dcleVar, int i) {
        uhx uhxVar = this.a;
        if (uhxVar.j.h(uhxVar.a.a(ufdVar, dcleVar))) {
            uhx uhxVar2 = this.a;
            uhxVar2.b.d(dclb.a(ufdVar, dcleVar), i);
        }
    }

    @Override // defpackage.dbzn
    public final void h(MediaContentItem mediaContentItem, dcle dcleVar, int i) {
        uhx uhxVar = this.a;
        if (uhxVar.j.h(uhxVar.f.a(mediaContentItem, dcleVar))) {
            uhx uhxVar2 = this.a;
            uhxVar2.b.d(dcll.a(mediaContentItem, dcleVar), i);
        }
    }

    @Override // defpackage.dbzn
    public final /* synthetic */ void j(appw appwVar, dcle dcleVar, boolean z) {
        dbzm.e(this, appwVar, dcleVar, z);
    }

    @Override // defpackage.dbzn
    public final void i(dcas dcasVar, boolean z) {
    }

    @Override // defpackage.dbzn
    public final void k(appw appwVar, dcle dcleVar, boolean z, int i) {
    }
}
