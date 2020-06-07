public abstract class NetCourse {
    protected final void createCourse() {
        this.postPreResource();
        this.createPPT();
        this.liveVideo();
        this.postNote();
        this.postSource();
        if (needHomework()) {
            checkHomework();
        }
    }

    protected abstract void checkHomework();

    protected boolean needHomework() {
        return false;
    }

    private void postSource() {
        System.out.println("提交代码");
    }

    private void postNote() {
        System.out.println("提交课件和笔记");
    }

    protected final void liveVideo() {
        System.out.println("直播授课");
    }

    protected final void createPPT() {
        System.out.println("创建PPT");
    }

    protected final void postPreResource() {
        System.out.println("分发预习资料");
    }


}
