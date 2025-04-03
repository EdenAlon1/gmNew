package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aooo implements aolr {
    public final fazb b;
    private final fazb c;
    private final fazb d;

    public aooo(fazb fazbVar, fazb fazbVar2, fazb fazbVar3) {
        this.c = fazbVar;
        this.d = fazbVar2;
        this.b = fazbVar3;
    }

    @Override // defpackage.aolr
    public final Optional A(ParticipantsTable.BindData bindData) {
        return bdrw.c(aoih.t(bindData.W(), bindData.U())) ? Optional.empty() : Optional.of(q(bindData));
    }

    @Override // defpackage.aobh
    public final aoku a(String str) {
        return ((aoji) this.c.b()).a(str);
    }

    @Override // defpackage.aobh
    public final aoku b(awui awuiVar) {
        return ((aoji) this.c.b()).b(awuiVar);
    }

    @Override // defpackage.aobh
    public final aoku c(String str, emyl emylVar) {
        return ((aoji) this.c.b()).c(str, emylVar);
    }

    @Override // defpackage.aobh
    public final aoku d(final djrj djrjVar) {
        return ((aoji) this.c.b()).l(((aomv) this.d.b()).d(djrjVar), new emyl() { // from class: aoog
            @Override // defpackage.emyl
            public final Object get() {
                return ((aonz) aooo.this.b.b()).d(djrjVar);
            }
        });
    }

    @Override // defpackage.aobh
    public final aoku e(String str, String str2, String str3, boolean z, String str4, emyl emylVar) {
        return ((aoji) this.c.b()).e(str, str2, str3, z, str4, emylVar);
    }

    @Override // defpackage.aobh
    public final aoku f() {
        return ((aoji) this.c.b()).f();
    }

    @Override // defpackage.aobh
    public final aoku g(aoku aokuVar, emyl emylVar) {
        return ((aoji) this.c.b()).g(aokuVar, emylVar);
    }

    @Override // defpackage.aobh
    @Deprecated
    public final aoku h(aoku aokuVar, String str) {
        return ((aoji) this.c.b()).h(aokuVar, str);
    }

    @Override // defpackage.aobh
    public final aoku i(aoku aokuVar, boolean z) {
        return ((aoji) this.c.b()).i(aokuVar, z);
    }

    @Override // defpackage.aobh
    public final aoku j(aoku aokuVar, int i) {
        return ((aoji) this.c.b()).j(aokuVar, i);
    }

    @Override // defpackage.aobh
    public final aoku k(aoku aokuVar) {
        return ((aoji) this.c.b()).k(aokuVar);
    }

    @Override // defpackage.aolr
    public final aoku l() {
        return ((aoji) this.c.b()).l(((aomv) this.d.b()).l(), new emyl() { // from class: aooa
            @Override // defpackage.emyl
            public final Object get() {
                return ((aonz) aooo.this.b.b()).l();
            }
        });
    }

    @Override // defpackage.aolr
    public final aoku m() {
        return ((aoji) this.c.b()).l(((aomv) this.d.b()).m(), new emyl() { // from class: aoon
            @Override // defpackage.emyl
            public final Object get() {
                return ((aonz) aooo.this.b.b()).m();
            }
        });
    }

    @Override // defpackage.aolr
    public final aoku n(final String str) {
        return ((aoji) this.c.b()).l(((aomv) this.d.b()).n(str), new emyl() { // from class: aook
            @Override // defpackage.emyl
            public final Object get() {
                return ((aonz) aooo.this.b.b()).n(str);
            }
        });
    }

    @Override // defpackage.aolr
    public final aoku o(final ParticipantsTable.BindData bindData) {
        return ((aoji) this.c.b()).l(((aomv) this.d.b()).o(bindData), new emyl() { // from class: aooc
            @Override // defpackage.emyl
            public final Object get() {
                return ((aonz) aooo.this.b.b()).o(bindData);
            }
        });
    }

    @Override // defpackage.aolr
    public final aoku p(final String str) {
        return ((aoji) this.c.b()).l(((aomv) this.d.b()).p(str), new emyl() { // from class: aoof
            @Override // defpackage.emyl
            public final Object get() {
                return ((aonz) aooo.this.b.b()).p(str);
            }
        });
    }

    @Override // defpackage.aolr
    public final aoku q(final ParticipantsTable.BindData bindData) {
        return ((aoji) this.c.b()).l(((aomv) this.d.b()).q(bindData), new emyl() { // from class: aoom
            @Override // defpackage.emyl
            public final Object get() {
                return ((aonz) aooo.this.b.b()).q(bindData);
            }
        });
    }

    @Override // defpackage.aolr
    public final aoku r(final String str) {
        return ((aoji) this.c.b()).l(((aomv) this.d.b()).r(str), new emyl() { // from class: aool
            @Override // defpackage.emyl
            public final Object get() {
                return ((aonz) aooo.this.b.b()).r(str);
            }
        });
    }

    @Override // defpackage.aolr
    public final aoku s(final qmc qmcVar) {
        return ((aoji) this.c.b()).l(((aomv) this.d.b()).s(qmcVar), new emyl() { // from class: aood
            @Override // defpackage.emyl
            public final Object get() {
                return ((aonz) aooo.this.b.b()).s(qmcVar);
            }
        });
    }

    @Override // defpackage.aolr
    public final aoku t(final ParticipantsTable.BindData bindData) {
        return ((aoji) this.c.b()).l(((aomv) this.d.b()).t(bindData), new emyl() { // from class: aooe
            @Override // defpackage.emyl
            public final Object get() {
                return ((aonz) aooo.this.b.b()).t(bindData);
            }
        });
    }

    @Override // defpackage.aolr
    public final aoku u(final String str, final int i) {
        return ((aoji) this.c.b()).l(((aomv) this.d.b()).u(str, i), new emyl() { // from class: aooi
            @Override // defpackage.emyl
            public final Object get() {
                return ((aonz) aooo.this.b.b()).u(str, i);
            }
        });
    }

    @Override // defpackage.aolr
    public final aoku v() {
        return ((aoji) this.c.b()).l(((aomv) this.d.b()).v(), new emyl() { // from class: aooh
            @Override // defpackage.emyl
            public final Object get() {
                return ((aonz) aooo.this.b.b()).v();
            }
        });
    }

    @Override // defpackage.aolr
    public final aoku w(final aoku aokuVar) {
        return ((aoji) this.c.b()).l(((aomv) this.d.b()).x(aokuVar), new emyl() { // from class: aoob
            @Override // defpackage.emyl
            public final Object get() {
                return ((aonz) aooo.this.b.b()).x(aokuVar);
            }
        });
    }

    @Override // defpackage.aolr
    public final aoku x(final aoku aokuVar) {
        return ((aoji) this.c.b()).l(((aomv) this.d.b()).x(aokuVar), new emyl() { // from class: aooj
            @Override // defpackage.emyl
            public final Object get() {
                return ((aonz) aooo.this.b.b()).x(aokuVar);
            }
        });
    }

    @Override // defpackage.aolr
    public final engw y(List list) {
        engr engrVar = new engr();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            engrVar.h(q((ParticipantsTable.BindData) it.next()));
        }
        return engrVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aolr
    public final engw z(avkl avklVar) {
        engr engrVar = new engr();
        if (avklVar.d()) {
            engw c = avklVar.c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                engrVar.h(((aoji) this.c.b()).b((awui) c.get(i)));
            }
        } else {
            engrVar.h(((aoji) this.c.b()).b(avklVar.a()));
        }
        return engrVar.g();
    }
}
