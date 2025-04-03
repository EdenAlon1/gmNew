package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class msy implements mty {
    public static final /* synthetic */ int b = 0;
    public nkh a;
    private final msw d;
    private final lwm e;
    private boolean f;

    public msy(Context context, nct nctVar) {
        lww lwwVar = new lww(context);
        this.e = lwwVar;
        this.a = new njs();
        msw mswVar = new msw(nctVar, this.a);
        this.d = mswVar;
        if (lwwVar != mswVar.d) {
            mswVar.d = lwwVar;
            mswVar.b.clear();
            mswVar.c.clear();
        }
        this.f = true;
    }

    public static mtk a(Class cls, lwm lwmVar) {
        try {
            return (mtk) cls.getConstructor(lwm.class).newInstance(lwmVar);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mtk
    public final mtn b(lqw lqwVar) {
        emyl emylVar;
        lti.f(lqwVar.b);
        String scheme = lqwVar.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(lqwVar.b.b, "application/x-image-uri")) {
            int i = msz.a;
            long j = lqwVar.b.i;
            int i2 = lvf.a;
            throw null;
        }
        lqt lqtVar = lqwVar.b;
        int o = lvf.o(lqtVar.a, lqtVar.b);
        if (lqwVar.b.i != -9223372036854775807L) {
            ((ncj) this.d.a).c();
        }
        try {
            final msw mswVar = this.d;
            Map map = mswVar.c;
            Integer valueOf = Integer.valueOf(o);
            mtk mtkVar = (mtk) map.get(valueOf);
            if (mtkVar == null) {
                emyl emylVar2 = (emyl) mswVar.b.get(valueOf);
                if (emylVar2 == null) {
                    final lwm lwmVar = mswVar.d;
                    lti.f(lwmVar);
                    if (o == 0) {
                        final Class<? extends U> asSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(mtk.class);
                        emylVar = new emyl() { // from class: msr
                            @Override // defpackage.emyl
                            public final Object get() {
                                return msy.a(asSubclass, lwmVar);
                            }
                        };
                    } else if (o == 1) {
                        final Class<? extends U> asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(mtk.class);
                        emylVar = new emyl() { // from class: mss
                            @Override // defpackage.emyl
                            public final Object get() {
                                return msy.a(asSubclass2, lwmVar);
                            }
                        };
                    } else if (o != 2) {
                        if (o != 3) {
                            emylVar2 = new emyl() { // from class: msv
                                @Override // defpackage.emyl
                                public final Object get() {
                                    return new mut(lwmVar, msw.this.a);
                                }
                            };
                        } else {
                            final Class<? extends U> asSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(mtk.class);
                            emylVar2 = new emyl() { // from class: msu
                                @Override // defpackage.emyl
                                public final Object get() {
                                    int i3 = msy.b;
                                    try {
                                        return (mtk) asSubclass3.getConstructor(new Class[0]).newInstance(new Object[0]);
                                    } catch (Exception e) {
                                        throw new IllegalStateException(e);
                                    }
                                }
                            };
                        }
                        mswVar.b.put(valueOf, emylVar2);
                    } else {
                        final Class<? extends U> asSubclass4 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(mtk.class);
                        emylVar = new emyl() { // from class: mst
                            @Override // defpackage.emyl
                            public final Object get() {
                                return msy.a(asSubclass4, lwmVar);
                            }
                        };
                    }
                    emylVar2 = emylVar;
                    mswVar.b.put(valueOf, emylVar2);
                }
                mtkVar = (mtk) emylVar2.get();
                mtkVar.e(mswVar.f);
                mtkVar.c(mswVar.e);
                mtkVar.d();
                mswVar.c.put(valueOf, mtkVar);
            }
            lqs lqsVar = lqwVar.c;
            lqr lqrVar = new lqr(lqsVar);
            if (lqsVar.a == -9223372036854775807L) {
                lqrVar.a = -9223372036854775807L;
            }
            if (lqsVar.d == -3.4028235E38f) {
                lqrVar.d = -3.4028235E38f;
            }
            if (lqsVar.e == -3.4028235E38f) {
                lqrVar.e = -3.4028235E38f;
            }
            if (lqsVar.b == -9223372036854775807L) {
                lqrVar.b = -9223372036854775807L;
            }
            if (lqsVar.c == -9223372036854775807L) {
                lqrVar.c = -9223372036854775807L;
            }
            lqs lqsVar2 = new lqs(lqrVar);
            if (!lqsVar2.equals(lqsVar)) {
                lql lqlVar = new lql(lqwVar);
                lqlVar.c = new lqr(lqsVar2);
                lqwVar = lqlVar.a();
            }
            mtn b2 = mtkVar.b(lqwVar);
            engw engwVar = lqwVar.b.g;
            if (!engwVar.isEmpty()) {
                enou enouVar = (enou) engwVar;
                mtn[] mtnVarArr = new mtn[enouVar.c + 1];
                mtnVarArr[0] = b2;
                int i3 = 0;
                while (i3 < enouVar.c) {
                    if (this.f) {
                        lqb lqbVar = new lqb();
                        String str = ((lqv) engwVar.get(i3)).b;
                        lqbVar.c(null);
                        String str2 = ((lqv) engwVar.get(i3)).c;
                        lqbVar.d = null;
                        int i4 = ((lqv) engwVar.get(i3)).d;
                        lqbVar.e = 0;
                        int i5 = ((lqv) engwVar.get(i3)).e;
                        lqbVar.f = 0;
                        String str3 = ((lqv) engwVar.get(i3)).f;
                        lqbVar.b = null;
                        String str4 = ((lqv) engwVar.get(i3)).g;
                        lqbVar.a = null;
                        final lqc lqcVar = new lqc(lqbVar);
                        mut mutVar = new mut(this.e, new nct() { // from class: msq
                            @Override // defpackage.nct
                            public final /* synthetic */ nco[] a(Uri uri, Map map2) {
                                msy msyVar = msy.this;
                                nco[] ncoVarArr = new nco[1];
                                nkh nkhVar = msyVar.a;
                                lqc lqcVar2 = lqcVar;
                                ncoVarArr[0] = nkhVar.c(lqcVar2) ? new nkb(msyVar.a.b(lqcVar2)) : new msx(lqcVar2);
                                return ncoVarArr;
                            }
                        });
                        if (this.a.c(lqcVar)) {
                            lqb lqbVar2 = new lqb(lqcVar);
                            lqbVar2.c("application/x-media3-cues");
                            lqbVar2.j = lqcVar.o;
                            lqbVar2.I = this.a.a(lqcVar);
                            lqcVar = new lqc(lqbVar2);
                        }
                        mutVar.a = lqcVar;
                        Uri uri = ((lqv) engwVar.get(i3)).a;
                        throw null;
                    }
                    int i6 = i3 + 1;
                    mtnVarArr[i6] = new mvh((lqv) engwVar.get(i3));
                    i3 = i6;
                }
                b2 = new mue(mtnVarArr);
            }
            long j2 = lqwVar.e.c;
            if (j2 != 0) {
                msg msgVar = new msg(b2);
                lti.a(j2 >= 0);
                lti.c(!msgVar.e);
                msgVar.b = j2;
                lqn lqnVar = lqwVar.e;
                lti.c(!msgVar.e);
                msgVar.c = Long.MIN_VALUE;
                lqn lqnVar2 = lqwVar.e;
                lti.c(!msgVar.e);
                msgVar.d = true;
                lqn lqnVar3 = lqwVar.e;
                lti.c(!msgVar.e);
                lqn lqnVar4 = lqwVar.e;
                lti.c(!msgVar.e);
                msgVar.e = true;
                b2 = new msj(msgVar);
            }
            lti.f(lqwVar.b);
            lqk lqkVar = lqwVar.b.d;
            return b2;
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.mtk
    @Deprecated
    public final /* bridge */ /* synthetic */ void c(boolean z) {
        this.f = z;
        msw mswVar = this.d;
        mswVar.e = z;
        ((ncj) mswVar.a).b(z);
        Iterator it = mswVar.c.values().iterator();
        while (it.hasNext()) {
            ((mtk) it.next()).c(z);
        }
    }

    @Override // defpackage.mtk
    public final /* bridge */ /* synthetic */ void e(nkh nkhVar) {
        lti.f(nkhVar);
        this.a = nkhVar;
        msw mswVar = this.d;
        mswVar.f = nkhVar;
        ((ncj) mswVar.a).d(nkhVar);
        Iterator it = mswVar.c.values().iterator();
        while (it.hasNext()) {
            ((mtk) it.next()).e(nkhVar);
        }
    }

    @Override // defpackage.mtk
    public final /* bridge */ /* synthetic */ void d() {
    }
}
