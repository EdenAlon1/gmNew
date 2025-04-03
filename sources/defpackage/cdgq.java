package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdgq implements cdgt {
    public final bqkw a;
    private final bqkx b;
    private final int c;

    public /* synthetic */ cdgq(bqkw bqkwVar, bqkx bqkxVar) {
        int i;
        switch (bqkxVar) {
            case BACKUP_KEY_OBJECT:
            case ENCRYPTION_KEY_OBJECT:
                i = 7;
                break;
            case PARTICIPANT:
                i = 3;
                break;
            case CONVERSATION:
                i = 2;
                break;
            case MESSAGE_OBJECT:
                i = 1;
                break;
            case MESSAGE_PART:
                i = 5;
                break;
            case UNKNOWN_CMS_DATA_TYPE:
                i = -1;
                break;
            default:
                throw new ffcd();
        }
        bqkwVar.getClass();
        bqkxVar.getClass();
        this.a = bqkwVar;
        this.b = bqkxVar;
        this.c = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    @Override // defpackage.cdgt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.epds r4) {
        /*
            r3 = this;
            bqkx r0 = r3.b
            bqkw r1 = r3.a
            int r1 = r1.ordinal()
            switch(r1) {
                case 0: goto L73;
                case 1: goto L73;
                case 2: goto L1e;
                case 3: goto L14;
                case 4: goto L1e;
                case 5: goto L14;
                case 6: goto L14;
                case 7: goto L14;
                case 8: goto L14;
                case 9: goto L11;
                case 10: goto L1e;
                case 11: goto L1e;
                default: goto Lb;
            }
        Lb:
            ffcd r4 = new ffcd
            r4.<init>()
            throw r4
        L11:
            epdw r0 = defpackage.epdw.UNSPECIFIED_BACKUP_TYPE
            goto L36
        L14:
            bqkx r1 = defpackage.bqkx.MESSAGE_PART
            if (r0 != r1) goto L1b
            epdw r0 = defpackage.epdw.PARTS_UPDATE
            goto L36
        L1b:
            epdw r0 = defpackage.epdw.UNSPECIFIED_BACKUP_TYPE
            goto L36
        L1e:
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L34;
                case 1: goto L34;
                case 2: goto L31;
                case 3: goto L2e;
                case 4: goto L2b;
                case 5: goto L11;
                case 6: goto L11;
                default: goto L25;
            }
        L25:
            ffcd r4 = new ffcd
            r4.<init>()
            throw r4
        L2b:
            epdw r0 = defpackage.epdw.MESSAGE_BACKUP
            goto L36
        L2e:
            epdw r0 = defpackage.epdw.CONVERSATION_BACKUP
            goto L36
        L31:
            epdw r0 = defpackage.epdw.PARTICIPANT_BACKUP
            goto L36
        L34:
            epdw r0 = defpackage.epdw.KEY_BACKUP
        L36:
            r4.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r1 = r4.instance
            epdt r1 = (defpackage.epdt) r1
            epdt r2 = defpackage.epdt.a
            int r0 = r0.w
            r1.c = r0
            int r0 = r1.b
            r2 = 1
            r0 = r0 | r2
            r1.b = r0
            bqkw r0 = r3.a
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L6d;
                case 1: goto L6d;
                case 2: goto L5a;
                case 3: goto L5a;
                case 4: goto L5a;
                case 5: goto L5a;
                case 6: goto L5a;
                case 7: goto L5a;
                case 8: goto L5a;
                case 9: goto L5b;
                case 10: goto L58;
                case 11: goto L5a;
                default: goto L52;
            }
        L52:
            ffcd r4 = new ffcd
            r4.<init>()
            throw r4
        L58:
            r2 = 2
            goto L5b
        L5a:
            r2 = 3
        L5b:
            r4.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r4 = r4.instance
            epdt r4 = (defpackage.epdt) r4
            int r2 = r2 + (-1)
            r4.g = r2
            int r0 = r4.b
            r0 = r0 | 16
            r4.b = r0
            return
        L6d:
            cdgs r4 = new cdgs
            r4.<init>()
            throw r4
        L73:
            cdgs r4 = new cdgs
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdgq.a(epds):void");
    }

    @Override // defpackage.cdgt
    public final void b(epep epepVar) {
        epfx epfxVar;
        switch (this.a) {
            case INITIAL_RESTORE_NON_RETRIABLE:
            case INITIAL_RESTORE_MAX_RETRIED:
                switch (this.b) {
                    case BACKUP_KEY_OBJECT:
                        epfxVar = epfx.RESTORE_BACKUP_KEY;
                        break;
                    case ENCRYPTION_KEY_OBJECT:
                        epfxVar = epfx.RESTORE_ENCRYPTION_KEY;
                        break;
                    case PARTICIPANT:
                        epfxVar = epfx.RESTORE_PARTICIPANT;
                        break;
                    case CONVERSATION:
                        epfxVar = epfx.RESTORE_CONVERSATION;
                        break;
                    case MESSAGE_OBJECT:
                    case MESSAGE_PART:
                        epfxVar = epfx.RESTORE_MESSAGE;
                        break;
                    case UNKNOWN_CMS_DATA_TYPE:
                        epfxVar = epfx.RESTORE;
                        break;
                    default:
                        throw new ffcd();
                }
            case BACKUP_CREATE:
            case BACKUP_UPDATE:
            case BACKUP_DELETE:
            case BACKUP_UPDATE_FREQUENT:
            case BACKUP_UPDATE_RARE:
            case BACKUP_UPDATE_ADDITIONAL_FIELDS:
            case BACKUP_UPDATE_URI:
            case BACKUP_UNKNOWN_OPERATION:
            case INCREMENTAL_BACKUP_CREATE:
                throw new cdgs();
            case INITIAL_BACKUP_CREATE:
                epfxVar = epfx.BACKUP;
                break;
            default:
                throw new ffcd();
        }
        epepVar.copyOnWrite();
        epeq epeqVar = (epeq) epepVar.instance;
        epeq epeqVar2 = epeq.a;
        epeqVar.c = epfxVar.s;
        epeqVar.b |= 1;
    }

    @Override // defpackage.cdgt
    public final void c(bqiv bqivVar) {
        bqivVar.c(this.a);
        bqivVar.j(this.b);
        bqivVar.h(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdgq)) {
            return false;
        }
        cdgq cdgqVar = (cdgq) obj;
        return this.a == cdgqVar.a && this.b == cdgqVar.b && this.c == cdgqVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "FailureContext(abandonedAction=" + this.a + ", cmsDataType=" + this.b + ", bugleTableType=" + this.c + ")";
    }
}
