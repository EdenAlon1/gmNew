package com.google.android.apps.messaging.ui.mediapicker.c2o.content;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import defpackage.bcvm;
import defpackage.bcvr;
import defpackage.byza;
import defpackage.cjja;
import defpackage.dbxq;
import defpackage.dbzq;
import defpackage.dbzt;
import defpackage.dbzu;
import defpackage.dcdw;
import defpackage.ehft;
import defpackage.ufa;
import defpackage.ufd;
import defpackage.ufg;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AttachmentQueueState implements Parcelable, bcvm {
    public static final Parcelable.Creator<AttachmentQueueState> CREATOR = new dbzt();
    public List a;
    public dcdw b;
    private final List c;
    private int d;
    private final MessagePartDataConverter e;

    public AttachmentQueueState(Parcel parcel) {
        this.a = new ArrayList();
        this.c = new ArrayList();
        ArrayList readArrayList = parcel.readArrayList(MediaContentItem.class.getClassLoader());
        if (readArrayList != null) {
            this.a = readArrayList;
        }
        this.d = parcel.readInt();
        this.e = (MessagePartDataConverter) parcel.readParcelable(MessagePartDataConverter.class.getClassLoader());
    }

    public static boolean m(MediaContentItem mediaContentItem) {
        return (mediaContentItem instanceof GalleryContentItem) && ((GalleryContentItem) mediaContentItem).f.equals(byza.GOOGLE_PHOTOS_LINK);
    }

    private static MediaContentItem t(ufd ufdVar) {
        if (ufdVar instanceof ufg) {
            ufg ufgVar = (ufg) ufdVar;
            return new ExpressiveStickerContentItem(ufgVar.e(), ufgVar.b(), ufgVar.f().getWidth(), ufgVar.f().getHeight(), ufgVar.a(), ufgVar.i());
        }
        if (ufdVar instanceof ufa) {
            ufa ufaVar = (ufa) ufdVar;
            return new CameraContentItem(ufaVar.e(), ufaVar.b(), ufaVar.f().getWidth(), ufaVar.f().getHeight(), ((Long) ufaVar.j().orElse(-1L)).longValue(), ufaVar.i(), ufaVar.a(), ufaVar.h());
        }
        if (!(ufdVar instanceof GalleryContent)) {
            return null;
        }
        GalleryContent galleryContent = (GalleryContent) ufdVar;
        return new GalleryContentItem(galleryContent.e(), galleryContent.b(), galleryContent.f().getWidth(), galleryContent.f().getHeight(), ((Long) galleryContent.j().orElse(-1L)).longValue(), galleryContent.i(), galleryContent.a(), galleryContent.h());
    }

    private final void u(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaContentItem a = this.e.a((MessagePartCoreData) it.next());
            if (a != null) {
                int indexOf = this.a.indexOf(a);
                if (indexOf >= 0) {
                    arrayList.add((MediaContentItem) this.a.get(indexOf));
                } else {
                    arrayList.add(a);
                }
            }
        }
        this.a = arrayList;
    }

    @Override // defpackage.bcvm
    public final void b(bcvr bcvrVar, int i) {
        if ((i & 1) == 1) {
            if (((Boolean) dbxq.a.e()).booleanValue() || bcvrVar.v.size() != this.a.size()) {
                this.d = bcvrVar.l();
                u(bcvrVar.v);
                k();
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e(Class cls) {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (cls.isInstance((MediaContentItem) it.next())) {
                i++;
            }
        }
        return i;
    }

    public final int f(ufd ufdVar) {
        MediaContentItem t = t(ufdVar);
        t.getClass();
        return this.a.indexOf(t);
    }

    @Deprecated
    public final int g(MediaContentItem mediaContentItem) {
        return this.a.indexOf(mediaContentItem);
    }

    public final List h(AttachmentQueueState attachmentQueueState) {
        ArrayList arrayList = new ArrayList();
        for (MediaContentItem mediaContentItem : this.a) {
            if (!attachmentQueueState.a.contains(mediaContentItem)) {
                arrayList.add(mediaContentItem);
            }
        }
        return arrayList;
    }

    public final List i(AttachmentQueueState attachmentQueueState) {
        return (List) Collection.EL.stream(h(attachmentQueueState)).filter(new Predicate() { // from class: dbzr
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((MediaContentItem) obj) instanceof GalleryContentItem;
            }
        }).map(new Function() { // from class: dbzs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                GalleryContentItem galleryContentItem = (GalleryContentItem) ((MediaContentItem) obj);
                ufk o = GalleryContent.o();
                o.f(galleryContentItem.f());
                o.k(galleryContentItem.e());
                ((uec) o).a = new Size(galleryContentItem.c(), galleryContentItem.b());
                o.e(galleryContentItem.d);
                o.i(galleryContentItem.e);
                o.j(galleryContentItem.f);
                long j = galleryContentItem.a;
                if (j > 0) {
                    o.g(j);
                }
                return o.l();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new dbzq()));
    }

    public final void j(dbzu dbzuVar) {
        this.c.add(dbzuVar);
    }

    public final void k() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((dbzu) it.next()).e(this);
        }
    }

    public final boolean l(ufd ufdVar) {
        return s(ufdVar);
    }

    public final boolean n(ufd ufdVar) {
        return f(ufdVar) != -1;
    }

    @Deprecated
    public final boolean o(MediaContentItem mediaContentItem) {
        return g(mediaContentItem) != -1;
    }

    public final boolean p(ufd ufdVar) {
        MediaContentItem t = t(ufdVar);
        t.getClass();
        return q(t);
    }

    @Deprecated
    public final boolean q(MediaContentItem mediaContentItem) {
        if (this.a.indexOf(mediaContentItem) < 0) {
            return false;
        }
        this.a.remove(mediaContentItem);
        k();
        return true;
    }

    @Deprecated
    public final boolean r(MediaContentItem mediaContentItem) {
        if (!((Boolean) cjja.a.e()).booleanValue() ? this.a.size() >= this.d : !(m(mediaContentItem) || ((int) Collection.EL.stream(this.a).filter(new Predicate() { // from class: dbzo
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return !AttachmentQueueState.m((MediaContentItem) obj);
            }
        }).count()) < this.d)) {
            this.a.add(mediaContentItem);
            k();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((dbzu) it.next()).j();
            }
            return true;
        }
        dcdw dcdwVar = this.b;
        if (dcdwVar == null) {
            return false;
        }
        ehft ehftVar = new ehft(dcdwVar.a.k);
        ehftVar.x(R.string.mms_attachment_limit_reached);
        ehftVar.m(R.string.attachment_limit_reached_dialog_message_when_composing);
        ehftVar.t(android.R.string.ok, null);
        ehftVar.a();
        return false;
    }

    public final boolean s(ufd ufdVar) {
        MediaContentItem t = t(ufdVar);
        t.getClass();
        return r(t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
        parcel.writeInt(this.d);
        parcel.writeParcelable(this.e, i);
    }

    public AttachmentQueueState(bcvr bcvrVar, MessagePartDataConverter messagePartDataConverter) {
        this.a = new ArrayList();
        this.c = new ArrayList();
        this.e = messagePartDataConverter;
        this.d = bcvrVar.l();
        u(bcvrVar.v);
    }

    public AttachmentQueueState(MessagePartDataConverter messagePartDataConverter) {
        this.a = new ArrayList();
        this.c = new ArrayList();
        this.e = messagePartDataConverter;
        this.a = new ArrayList();
        this.d = 10;
    }

    @Override // defpackage.bcvm
    public final void fs() {
    }

    @Override // defpackage.bcvm
    public final void ft(bcvr bcvrVar) {
    }

    @Override // defpackage.bcvm
    public final void fv(bcvr bcvrVar) {
    }
}
