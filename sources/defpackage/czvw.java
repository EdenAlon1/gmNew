package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czvw implements czvg {
    public static final /* synthetic */ int e = 0;
    public final ffbr b;
    public final ffsk c;
    public final comc d;
    private final ejvp f;
    private final AtomicBoolean g;
    private final AtomicBoolean h;

    public czvw(ejvp ejvpVar, ffbr ffbrVar, ffsk ffskVar, comc comcVar) {
        ejvpVar.getClass();
        ffbrVar.getClass();
        ffskVar.getClass();
        this.f = ejvpVar;
        this.b = ffbrVar;
        this.c = ffskVar;
        this.d = comcVar;
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
    }

    @Override // defpackage.czvg
    public final ejxi a() {
        return new czvm(this);
    }

    @Override // defpackage.czvg
    public final ejxi b() {
        return new czvo(this);
    }

    @Override // defpackage.czvg
    public final void c(SuggestionData suggestionData) {
        axol.k(this.c, null, new czvp(this, suggestionData, null), 3);
        if (this.g.compareAndSet(false, true)) {
            ejvp ejvpVar = this.f;
            comc comcVar = this.d;
            final ffji ffjiVar = new ffji() { // from class: czvh
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    int i = czvw.e;
                    czvx czvxVar = (czvx) ((czvy) obj).toBuilder();
                    czvxVar.copyOnWrite();
                    czvy czvyVar = (czvy) czvxVar.instance;
                    czvyVar.b |= 2;
                    czvyVar.d = true;
                    return (czvy) czvxVar.build();
                }
            };
            ejvpVar.a(comcVar.j(new emwl() { // from class: czvi
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    int i = czvw.e;
                    return ffji.this.invoke(obj);
                }
            }), czvf.a);
        }
    }

    @Override // defpackage.czvg
    public final void d(final MessageIdType messageIdType) {
        if (this.h.compareAndSet(false, true)) {
            ejvp ejvpVar = this.f;
            comc comcVar = this.d;
            final ffji ffjiVar = new ffji() { // from class: czvj
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    int i = czvw.e;
                    czvx czvxVar = (czvx) ((czvy) obj).toBuilder();
                    String b = MessageIdType.this.b();
                    czvxVar.copyOnWrite();
                    czvy czvyVar = (czvy) czvxVar.instance;
                    b.getClass();
                    czvyVar.b |= 8;
                    czvyVar.f = b;
                    return (czvy) czvxVar.build();
                }
            };
            ejvpVar.a(comcVar.j(new emwl() { // from class: czvk
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    int i = czvw.e;
                    return ffji.this.invoke(obj);
                }
            }), czvf.b);
        }
    }

    @Override // defpackage.czvg
    public final void e() {
        axol.k(this.c, null, new czvs(this, null), 3);
    }

    @Override // defpackage.czvg
    public final void f() {
        axol.k(this.c, null, new czvv(this, null), 3);
    }
}
