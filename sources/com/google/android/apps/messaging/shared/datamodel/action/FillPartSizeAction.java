package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.FillPartSizeAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import defpackage.baeg;
import defpackage.baeh;
import defpackage.bdpt;
import defpackage.bwdf;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.emyl;
import defpackage.eogt;
import defpackage.ffbr;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class FillPartSizeAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new baeg();
    public final ffbr a;
    private final dtuu b;

    /* compiled from: PG */
    public interface a {
        baeh hK();
    }

    public FillPartSizeAction(ffbr ffbrVar, dtuu dtuuVar) {
        super(eogt.FILL_PART_SIZE_ACTION);
        this.a = ffbrVar;
        this.b = dtuuVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("FillPartSizeAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        w();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.FillPartSize.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fR() {
        final bdpt bdptVar = (bdpt) this.a.b();
        ekzz f = eleg.f("MessagePartDatabaseOperations#getMessagePartsWithoutSizes");
        try {
            bwdf c = PartsTable.c();
            c.z("getMessagePartsWithoutSizes");
            c.r();
            c.h(new Function() { // from class: bdox
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwdm bwdmVar = (bwdm) obj;
                    bwdmVar.b(new Function() { // from class: bdpl
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bwdm bwdmVar2 = (bwdm) obj2;
                            bwdmVar2.g("image/%");
                            return bwdmVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: bdpm
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bwdm bwdmVar2 = (bwdm) obj2;
                            bwdmVar2.g("video/%");
                            return bwdmVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: bdpn
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bwdm bwdmVar2 = (bwdm) obj2;
                            bwdmVar2.f("application/vnd.gsma.rcspushlocation+xml");
                            return bwdmVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bwdmVar.aq(new dtwe("parts.width", 1, -1));
                    return bwdmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            Stream D = c.b().D();
            try {
                List<MessagePartCoreData> list = (List) D.map(new Function() { // from class: bdoy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bcwz) bdpt.this.a.b()).e((PartsTable.BindData) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: bdoz
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
                if (D != null) {
                    D.close();
                }
                f.close();
                if (list == null) {
                    return null;
                }
                for (final MessagePartCoreData messagePartCoreData : list) {
                    messagePartCoreData.ai();
                    this.b.c("FillPartSizeAction.doBackgroundWork", new emyl() { // from class: baef
                        @Override // defpackage.emyl
                        public final Object get() {
                            MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                            ConversationIdType A = messagePartCoreData2.A();
                            if (A == null) {
                                A = bdgq.a;
                            }
                            bdpt bdptVar2 = (bdpt) FillPartSizeAction.this.a.b();
                            MessageIdType B = messagePartCoreData2.B();
                            String aa = messagePartCoreData2.aa();
                            String[] strArr = PartsTable.a;
                            bwdi bwdiVar = new bwdi();
                            bwdiVar.ap("FillPartSizeAction#doBackgroundWork");
                            bwdiVar.B(messagePartCoreData2.c());
                            bwdiVar.p(messagePartCoreData2.b());
                            return Boolean.valueOf(bdptVar2.f(A, B, aa, bwdiVar));
                        }
                    });
                }
                return null;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public FillPartSizeAction(ffbr ffbrVar, dtuu dtuuVar, Parcel parcel) {
        super(parcel, eogt.FILL_PART_SIZE_ACTION);
        this.a = ffbrVar;
        this.b = dtuuVar;
    }
}
