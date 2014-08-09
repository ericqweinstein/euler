# encoding: UTF-8

require './euler'

describe Euler do
  subject { Euler.new }

  describe '#problem_one' do
    it 'solves problem number one' do
      expect(subject.problem_one).to be(233168)
    end
  end

  describe '#problem_two' do
    it 'solves problem number two' do
      expect(subject.problem_two).to be(4613732)
    end
  end

  describe '#problem_three' do
    it 'solves problem number three' do
      expect(subject.problem_three).to be(6857)
    end
  end

  describe '#problem_four' do
    it 'solves problem number four' do
      expect(subject.problem_four).to be(906609)
    end
  end

  describe '#problem_five' do
    it 'solves problem number five' do
      expect(subject.problem_five).to be(232792560)
    end
  end

  describe '#problem_six' do
    it 'solves problem number six' do
      expect(subject.problem_six).to be(25164150)
    end
  end

  describe '#problem_seven' do
    it 'solves problem number seven' do
      expect(subject.problem_seven).to be(104743)
    end
  end

  describe '#problem_eight' do
    it 'solves problem number eight' do
      expect(subject.problem_eight).to be(40824)
    end
  end

  describe '#problem_nine' do
    it 'solves problem number nine' do
      expect(subject.problem_nine(1_000)).to eql([375, 200, 425])
    end
  end

  describe '#problem_ten' do
    it 'solves problem number ten' do
      expect(subject.problem_ten).to be(142913828922)
    end
  end
end
