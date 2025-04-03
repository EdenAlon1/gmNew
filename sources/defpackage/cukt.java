package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cukt implements emwl {
    @Override // defpackage.emwl
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eres apply(Status.Code code) {
        Status.Code code2 = Status.Code.OK;
        switch (code.ordinal()) {
            case 1:
                return eres.RPC_CANCELLED;
            case 2:
                return eres.RPC_UNKNOWN;
            case 3:
                return eres.RPC_INVALID_ARGUMENT;
            case 4:
                return eres.RPC_DEADLINE_EXCEEDED;
            case 5:
                return eres.RPC_NOT_FOUND;
            case 6:
                return eres.RPC_ALREADY_EXISTS;
            case 7:
                return eres.RPC_PERMISSION_DENIED;
            case 8:
                return eres.RPC_RESOURCE_EXHAUSTED;
            case 9:
                return eres.RPC_FAILED_PRECONDITION;
            case 10:
                return eres.RPC_ABORTED;
            case 11:
                return eres.RPC_OUT_OF_RANGE;
            case 12:
                return eres.RPC_UNIMPLEMENTED;
            case 13:
                return eres.RPC_INTERNAL;
            case 14:
                return eres.RPC_UNAVAILABLE;
            case 15:
                return eres.RPC_DATA_LOSS;
            case 16:
                return eres.RPC_UNAUTHENTICATED;
            default:
                return b(code);
        }
    }

    public eres b(Status.Code code) {
        throw null;
    }
}
