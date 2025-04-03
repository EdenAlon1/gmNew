package defpackage;

import android.net.Uri;
import android.util.ArrayMap;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uwl extends ejte {
    final /* synthetic */ uwm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwl(uwm uwmVar, elbx elbxVar, Executor executor) {
        super(elbxVar, "ParticipantsObserver.ParticipantObserver#onChange", executor);
        this.a = uwmVar;
    }

    @Override // defpackage.ejte
    public final void a(boolean z, Uri uri) {
        if (uri == null) {
            return;
        }
        boolean equals = bdgq.b(uri.getLastPathSegment()).equals(this.a.b);
        if (uri.getPathSegments().size() < bcqc.i(this.a.a).getPathSegments().size() + 1 || equals) {
            ((Optional) this.a.d.get()).ifPresent(new Consumer() { // from class: uwk
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    final uwh uwhVar = ((uwe) obj).a;
                    csix.h();
                    List L = ((bczy) uwhVar.o.b()).L(uwhVar.c);
                    final ArrayMap arrayMap = new ArrayMap();
                    enqv it = ((engw) L).iterator();
                    while (it.hasNext()) {
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                        arrayMap.put(bindData.S(), bindData);
                    }
                    efbd.a().post(new Runnable() { // from class: uvy
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z2;
                            uwh uwhVar2 = uwh.this;
                            uwhVar2.f.f();
                            int i = 0;
                            while (true) {
                                mz mzVar = uwhVar2.f;
                                if (i >= mzVar.g) {
                                    mzVar.h();
                                    return;
                                }
                                bcse bcseVar = (bcse) mzVar.e(i);
                                enin eninVar = new enin();
                                String I = bcseVar.I();
                                if (I != null) {
                                    eninVar.c(I);
                                }
                                RepliedToDataAdapter repliedToDataAdapter = bcseVar.x;
                                String a = repliedToDataAdapter != null ? repliedToDataAdapter.a() : null;
                                if (a != null) {
                                    eninVar.c(a);
                                }
                                enqu listIterator = eninVar.g().listIterator();
                                boolean z3 = false;
                                while (listIterator.hasNext()) {
                                    ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) arrayMap.get((String) listIterator.next());
                                    if (bindData2 != null) {
                                        boolean z4 = true;
                                        if (!Objects.equals(bcseVar.c.X(), bindData2.S()) || bcseVar.d.equals(bindData2)) {
                                            z2 = false;
                                        } else {
                                            bcseVar.k.e(bindData2);
                                            bcseVar.d = bindData2;
                                            z2 = true;
                                        }
                                        RepliedToDataAdapter repliedToDataAdapter2 = bcseVar.x;
                                        if (repliedToDataAdapter2 != null && Objects.equals(repliedToDataAdapter2.a(), bindData2.S())) {
                                            RepliedToDataAdapter repliedToDataAdapter3 = bcseVar.x;
                                            ajrt ajrtVar = repliedToDataAdapter3.a.e;
                                            if (ajrtVar == null) {
                                                ajrtVar = ajrt.a;
                                            }
                                            ajrw ajrwVar = ajrtVar.c;
                                            if (ajrwVar == null) {
                                                ajrwVar = ajrw.a;
                                            }
                                            if (ajrwVar.b != 3) {
                                                throw new IllegalArgumentException("copyForHeaderUpdate when the header is not a ParticipantName");
                                            }
                                            if (!ffkj.e(repliedToDataAdapter3.a(), bindData2.S())) {
                                                throw new IllegalArgumentException("copyForHeaderUpdate with mismatching participant");
                                            }
                                            ajsn ajsnVar = (ajsn) repliedToDataAdapter3.a.toBuilder();
                                            ajsnVar.getClass();
                                            ajrt ajrtVar2 = ((ajso) ajsnVar.instance).e;
                                            if (ajrtVar2 == null) {
                                                ajrtVar2 = ajrt.a;
                                            }
                                            ajrtVar2.getClass();
                                            ajrs ajrsVar = (ajrs) ajrtVar2.toBuilder();
                                            ajrsVar.getClass();
                                            entd entdVar = ajqu.a;
                                            ajru.c(new ajqz(bindData2).a(), ajrsVar);
                                            ajtc.b(ajru.a(ajrsVar), ajsnVar);
                                            RepliedToDataAdapter repliedToDataAdapter4 = new RepliedToDataAdapter(ajtc.a(ajsnVar));
                                            if (!repliedToDataAdapter4.equals(bcseVar.x)) {
                                                bcseVar.x = repliedToDataAdapter4;
                                                z3 |= z4;
                                            }
                                        }
                                        z4 = z2;
                                        z3 |= z4;
                                    }
                                }
                                if (z3) {
                                    uwhVar2.f.k(i, bcseVar);
                                }
                                i++;
                            }
                        }
                    });
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }
}
