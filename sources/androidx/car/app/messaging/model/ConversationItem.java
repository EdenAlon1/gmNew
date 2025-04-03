package androidx.car.app.messaging.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import defpackage.cfs;
import defpackage.cgs;
import defpackage.cgv;
import defpackage.cgw;
import defpackage.cgx;
import defpackage.chp;
import defpackage.clb;
import defpackage.knq;
import defpackage.knr;
import defpackage.ksw;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public class ConversationItem implements chp {
    private final List<Action> mActions;
    private final cgs mConversationCallbackDelegate;
    private final CarIcon mIcon;
    private final String mId;
    private final boolean mIndexable;
    private final boolean mIsGroupConversation;
    private final List<CarMessage> mMessages;
    private final knr mSelf;
    private final CarText mTitle;

    private ConversationItem() {
        this.mId = "";
        this.mTitle = new CarText.Builder("").build();
        knq knqVar = new knq();
        knqVar.a = "";
        this.mSelf = new knr(knqVar);
        this.mIcon = null;
        this.mIsGroupConversation = false;
        this.mMessages = new ArrayList();
        this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl(new cgv());
        this.mActions = Collections.EMPTY_LIST;
        this.mIndexable = true;
    }

    static knr validateSender(knr knrVar) {
        knrVar.getClass();
        knrVar.a.getClass();
        knrVar.d.getClass();
        return knrVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationItem)) {
            return false;
        }
        ConversationItem conversationItem = (ConversationItem) obj;
        return Objects.equals(this.mId, conversationItem.mId) && Objects.equals(this.mTitle, conversationItem.mTitle) && Objects.equals(this.mIcon, conversationItem.mIcon) && cgx.b(getSelf(), conversationItem.getSelf()) && this.mIsGroupConversation == conversationItem.mIsGroupConversation && Objects.equals(this.mMessages, conversationItem.mMessages) && Objects.equals(this.mActions, conversationItem.mActions) && this.mIndexable == conversationItem.mIndexable;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public cgs getConversationCallbackDelegate() {
        return this.mConversationCallbackDelegate;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public String getId() {
        return this.mId;
    }

    public List<CarMessage> getMessages() {
        return this.mMessages;
    }

    public knr getSelf() {
        return this.mSelf;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(cgx.a(getSelf())), this.mId, this.mTitle, this.mIcon, Boolean.valueOf(this.mIsGroupConversation), this.mMessages, this.mActions, Boolean.valueOf(this.mIndexable));
    }

    public boolean isGroupConversation() {
        return this.mIsGroupConversation;
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    public ConversationItem(cgw cgwVar) {
        String str = cgwVar.a;
        str.getClass();
        this.mId = str;
        CarText carText = cgwVar.b;
        carText.getClass();
        this.mTitle = carText;
        knr knrVar = cgwVar.c;
        validateSender(knrVar);
        this.mSelf = knrVar;
        this.mIcon = cgwVar.d;
        this.mIsGroupConversation = cgwVar.e;
        List<CarMessage> b = clb.b(cgwVar.f);
        b.getClass();
        this.mMessages = b;
        ksw.d(!b.isEmpty(), "Message list cannot be empty.");
        Iterator<CarMessage> it = b.iterator();
        while (it.hasNext()) {
            ksw.d(it.next() != null, "Message list cannot contain null messages");
        }
        cgs cgsVar = cgwVar.g;
        cgsVar.getClass();
        this.mConversationCallbackDelegate = cgsVar;
        this.mActions = clb.b(cgwVar.h);
        boolean z = cgwVar.i;
        this.mIndexable = true;
    }
}
