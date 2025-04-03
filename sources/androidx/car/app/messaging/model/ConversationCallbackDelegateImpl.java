package androidx.car.app.messaging.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.messaging.model.ConversationCallbackDelegateImpl;
import androidx.car.app.messaging.model.IConversationCallback;
import androidx.car.app.utils.RemoteUtils;
import defpackage.cfi;
import defpackage.cfs;
import defpackage.cgr;
import defpackage.cgs;
import defpackage.clh;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public class ConversationCallbackDelegateImpl implements cgs {
    private final IConversationCallback mConversationCallbackBinder;

    /* compiled from: PG */
    @cfs
    public static class ConversationCallbackStub extends IConversationCallback.Stub {
        private final cgr mConversationCallback;

        public ConversationCallbackStub(cgr cgrVar) {
            this.mConversationCallback = cgrVar;
        }

        /* renamed from: lambda$onMarkAsRead$0$androidx-car-app-messaging-model-ConversationCallbackDelegateImpl$ConversationCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m193xf996ad9e() {
            this.mConversationCallback.a();
            return null;
        }

        /* renamed from: lambda$onTextReply$1$androidx-car-app-messaging-model-ConversationCallbackDelegateImpl$ConversationCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m194xc3f6a0cd(String str) {
            this.mConversationCallback.b(str);
            return null;
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onMarkAsRead(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.b(iOnDoneCallback, "onMarkAsRead", new clh() { // from class: cgu
                @Override // defpackage.clh
                public final Object a() {
                    return ConversationCallbackDelegateImpl.ConversationCallbackStub.this.m193xf996ad9e();
                }
            });
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onTextReply(IOnDoneCallback iOnDoneCallback, final String str) {
            RemoteUtils.b(iOnDoneCallback, "onReply", new clh() { // from class: cgt
                @Override // defpackage.clh
                public final Object a() {
                    return ConversationCallbackDelegateImpl.ConversationCallbackStub.this.m194xc3f6a0cd(str);
                }
            });
        }
    }

    private ConversationCallbackDelegateImpl() {
        this.mConversationCallbackBinder = null;
    }

    public void sendMarkAsRead(cfi cfiVar) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            iConversationCallback.getClass();
            iConversationCallback.onMarkAsRead(new RemoteUtils.AnonymousClass1(cfiVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendTextReply(String str, cfi cfiVar) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            iConversationCallback.getClass();
            iConversationCallback.onTextReply(new RemoteUtils.AnonymousClass1(cfiVar), str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public ConversationCallbackDelegateImpl(cgr cgrVar) {
        this.mConversationCallbackBinder = new ConversationCallbackStub(cgrVar);
    }
}
